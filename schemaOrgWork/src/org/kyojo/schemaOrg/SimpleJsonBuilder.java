package org.kyojo.schemaorg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.kyojo.schemaorg.JsonListIndex;
import org.kyojo.schemaorg.JsonListNo;

/**
 * This class is the JSON builder for JSONizing schemeOrg objects.
 * It is added functions internally no other general JSON builders provide,
 * but enough available as a simple JSON builder for any purpose.
 */
public class SimpleJsonBuilder {

	private static final Log logger = LogFactory.getLog(SimpleJsonBuilder.class);

	private static Pattern cmlPt1 = Pattern.compile("[A-Z]+");
	private static Pattern cmlPt2 = Pattern.compile("([A-Z]+)([A-Z].*)");
	private static Pattern cmlPt3 = Pattern.compile("([A-Z])(.*)");
	private static final int DEPTH_LIMIT = 100;

	public static List<Field> getAllFields(Class<?> type) {
		List<Field> flds = new ArrayList<>();
		for(Class<?> cls = type; cls != null; cls = cls.getSuperclass()) {
			flds.addAll(Arrays.asList(cls.getDeclaredFields()));
		}
		return flds;
	}

	/**
	 * Serializes the given object to JSON
	 *
	 * @param obj the object to serialize
	 * @return JSON string
	 */
	public static String toJson(Object obj) {
		return toJson(obj, obj.getClass());
	}

	/**
	 * Serializes the given object to JSON
	 *
	 * @param obj the object to serialize
	 * @param cls the specified object class
	 * @return JSON string
	 */
	public static String toJson(Object obj, Class<?> cls) {
		logger.debug("class: " + cls.getName());
		String json = toJson(obj, cls, null, 0, new LinkedList<>(), false);
		logger.debug("json: " + json);
		return json;
	}

	/**
	 * Serializes the given object to JSON-LD
	 *
	 * @param obj the object to serialize
	 * @return JSON string
	 */
	public static String toJsonLd(Object obj) {
		return toJsonLd(obj, obj.getClass());
	}

	/**
	 * Serializes the given object to JSON-LD
	 *
	 * @param obj the object to serialize
	 * @param cls the specified object class
	 * @return JSON string
	 */
	public static String toJsonLd(Object obj, Class<?> cls) {
		logger.debug("class: " + cls.getName());
		String jsonLd = toJson(obj, cls, null, 0, new LinkedList<>(), true);
		logger.debug("jsonLd: " + jsonLd);
		return jsonLd;
	}

	private static String toJson(Object obj, Class<?> cls, Integer idx,
			int depth, LinkedList<Object> stack, boolean isJsonLd) {
		stack.addFirst(obj);
		String valStr1 = toValStr(obj, cls);
		if(valStr1 != null) {
			logger.trace(cls.getName() + " -> " + valStr1);
			return valStr1;
		}

		Map<String, String> jsonLdStrMap = new HashMap<>();
		if(isJsonLd) {
			JsonLdContext jsonLdContext = cls.getAnnotation(JsonLdContext.class);
			if(jsonLdContext != null) {
				jsonLdStrMap.put("@context", jsonLdContext.value());
			}

			SchemaOrgLabel schemaOrgLabel = cls.getAnnotation(SchemaOrgLabel.class);
			if(schemaOrgLabel != null) {
				jsonLdStrMap.put("@type", schemaOrgLabel.value());
			}
		}

		boolean isJsonLdProperty = false;
		if(isJsonLd && SchemaOrgProperty.class.isAssignableFrom(cls)) {
			isJsonLdProperty = true;
		}

		StringBuilder sb = null;
		if(cls.isArray() && cls.getComponentType().equals(byte.class)) {
			sb = new StringBuilder("null");
			return sb.toString();
		} else if(cls.isArray() || List.class.isAssignableFrom(cls)) {
			List<?> list = cls.isArray() ? Arrays.asList(obj) : (List<?>)obj;
			sb = new StringBuilder("[");
			for(int li = 0; li < list.size(); li++) {
				Object le = list.get(li);
				if(le == null) {
					sb.append("null");
				} else {
					boolean loop = false;
					for(Object to : stack) {
						if(to.equals(le)) {
							loop = true;
							break;
						}
					}
					if(loop) {
						sb.append("null");
						logger.warn("object looping:");
						stack.forEach(to -> logger.warn(" (" + to.getClass() + ") "));
					} else if(depth == DEPTH_LIMIT) {
						sb.append("null");
						logger.warn("depth limit over:");
						stack.forEach(to -> logger.warn(" (" + to.getClass() + ") "));
					} else {
						// ToDo: le.getClass()は意図した型が取れないかもしれないがしかたないか
						sb.append(toJson(le, le.getClass(), li, depth + 1, new LinkedList<>(stack), isJsonLd));
					}
				}
				if(li < list.size() - 1) {
					sb.append(",");
				}
			}
			sb.append("]");
			return sb.toString();
		} else if(Map.class.isAssignableFrom(cls)) {
			Map<?, ?> map = (Map<?, ?>)obj;
			sb = new StringBuilder("{");
			int mi = 0;
			for(Map.Entry<?, ?> ent : map.entrySet()) {
				Object val = ent.getValue();
				sb.append("\"");
				sb.append(escapeJson(ent.getKey().toString()));
				sb.append("\":");
				if(val == null) {
					sb.append("null");
				} else {
					boolean loop = false;
					for(Object to : stack) {
						if(to.equals(val)) {
							loop = true;
							break;
						}
					}
					if(loop) {
						sb.append("null");
						logger.warn("object looping:");
						stack.forEach(to -> logger.warn(" (" + to.getClass() + ") "));
					} else if(depth == DEPTH_LIMIT) {
						sb.append("null");
						logger.warn("depth limit over:");
						stack.forEach(to -> logger.warn(" (" + to.getClass() + ") "));
					} else {
						// ToDo: val.getClass()は意図した型が取れないかもしれないがしかたないか
						sb.append(toJson(val, val.getClass(), null, depth + 1, new LinkedList<>(stack), isJsonLd));
					}
				}

				if(mi < map.size() - 1) {
					sb.append(",");
				}
				mi++;
			}
			sb.append("}");
			return sb.toString();
		}

		// パラメータ名称の決定
		List<Field> dclFlds = getAllFields(cls);
		HashMap<String, Field> lcDclFldNameMap = new HashMap<>();
		HashMap<String, Field> lcExcldFldNameMap = new HashMap<>(); // Groovyのget/set自動生成のため必要
		Field listIndexFld = null;
		Field listNoFld = null;
		Object listIndexVal = null;
		Object listNoVal = null;
		for(Field dclFld : dclFlds) {
			String dfn = dclFld.getName().toLowerCase();
			if(lcDclFldNameMap.containsKey(dfn)) {
				// 下位クラスのフィールドを優先
				continue;
			}

			int modifier = dclFld.getModifiers();
			if(Modifier.isFinal(modifier)
					|| Modifier.isStatic(modifier) || Modifier.isTransient(modifier)
					|| Modifier.isVolatile(modifier)) {
				lcExcldFldNameMap.put(dfn, dclFld);
				continue;
			}
			if(!dclFld.getName().equals("class") && !dclFld.getName().equals("nativeValue")
					&& !dclFld.getName().equals("property") && !dclFld.getName().equals("metaClass")
					&& !dclFld.getName().equals("serialVersionUID")
					&& !dclFld.getName().equals("logger") && !dclFld.getName().equals("thisClass")
					&& !dclFld.getName().startsWith("_") && !dclFld.getName().startsWith("$")) {
				lcDclFldNameMap.put(dfn, dclFld);
			} else {
				lcExcldFldNameMap.put(dfn, dclFld);
			}

			if(idx != null) {
				if(dclFld.isAnnotationPresent(JsonListIndex.class)) {
					if(Integer.class.isAssignableFrom(dclFld.getType())
							|| int.class.isAssignableFrom(dclFld.getType())) {
						listIndexFld = dclFld;
						listIndexVal = idx;
					} else if(Long.class.isAssignableFrom(dclFld.getType())
							|| long.class.isAssignableFrom(dclFld.getType())) {
						listIndexFld = dclFld;
						listIndexVal = idx.longValue();
					} else if(String.class.isAssignableFrom(dclFld.getType())) {
						listIndexFld = dclFld;
						listIndexVal = "" + idx;
					}
				} else if(dclFld.isAnnotationPresent(JsonListNo.class)) {
					if(Integer.class.isAssignableFrom(dclFld.getType())
							|| int.class.isAssignableFrom(dclFld.getType())) {
						listNoFld = dclFld;
						listNoVal = new Integer(idx + 1);
					} else if(Long.class.isAssignableFrom(dclFld.getType())
							|| long.class.isAssignableFrom(dclFld.getType())) {
						listNoFld = dclFld;
						listNoVal = new Long(idx.longValue() + 1L);
					} else if(String.class.isAssignableFrom(dclFld.getType())) {
						listNoFld = dclFld;
						listNoVal = "" + (idx + 1);
					}
				}
			}
		}

		Method[] mtds = cls.getMethods();
		HashMap<String, Method> lcGetMtdNameMap = new HashMap<>();
		HashMap<String, Method> tmpMtdMap = new HashMap<>();
		Method listIndexMtd = null;
		Method listNoMtd = null;
		for(Method mtd : mtds) {
			int modifier = mtd.getModifiers();
			if(Modifier.isFinal(modifier)
					|| Modifier.isStatic(modifier) || Modifier.isTransient(modifier)
					|| Modifier.isVolatile(modifier)) {
				continue;
			}
			if(mtd.getName().length() > 3 && (mtd.getName().startsWith("get") || mtd.getName().startsWith("set"))) {
				tmpMtdMap.put(mtd.getName(), mtd);
			}
		}
		for(Method mtd : tmpMtdMap.values()) {
			if(mtd.getName().startsWith("get")
					&& mtd.getParameterTypes().length == 0
					&& !mtd.getName().equals("getClass") && !mtd.getName().equals("getNativeValue")
					&& !mtd.getName().equals("getProperty") && !mtd.getName().equals("getMetaClass")
					&& !mtd.getName().equals("getThisClass")) {
				String prmName = mtd.getName().substring(3);
				if(tmpMtdMap.containsKey("set" + prmName)) {
					String lcGetMtdName = prmName.toLowerCase();
					if(!lcExcldFldNameMap.containsKey(lcGetMtdName)) {
						lcGetMtdNameMap.put(lcGetMtdName, mtd);
					}

					if(idx != null) {
						if((mtd.isAnnotationPresent(JsonListIndex.class)
									|| (listIndexFld != null
										&& listIndexFld.getName().equalsIgnoreCase(prmName)))) {
							if(Integer.class.isAssignableFrom(mtd.getReturnType())
									|| int.class.isAssignableFrom(mtd.getReturnType())) {
								listIndexMtd = mtd;
								listIndexVal = idx;
								listIndexFld = null;
							} else if(Long.class.isAssignableFrom(mtd.getReturnType())
									|| long.class.isAssignableFrom(mtd.getReturnType())) {
								listIndexMtd = mtd;
								listIndexVal = idx.longValue();
								listIndexFld = null;
							} else if(String.class.isAssignableFrom(mtd.getReturnType())) {
								listIndexMtd = mtd;
								listIndexVal = "" + idx;
								listIndexFld = null;
							}
						} else if((mtd.isAnnotationPresent(JsonListNo.class)
									|| (listNoFld != null
										&& listNoFld.getName().equalsIgnoreCase(prmName)))) {
							if(Integer.class.isAssignableFrom(mtd.getReturnType())
									|| int.class.isAssignableFrom(mtd.getReturnType())) {
								listNoMtd = mtd;
								listNoVal = new Integer(idx + 1);
								listNoFld = null;
							} else if(Long.class.isAssignableFrom(mtd.getReturnType())
									|| long.class.isAssignableFrom(mtd.getReturnType())) {
								listNoMtd = mtd;
								listNoVal = new Long(idx.longValue() + 1L);
								listNoFld = null;
							} else if(String.class.isAssignableFrom(mtd.getReturnType())) {
								listNoMtd = mtd;
								listNoVal = "" + (idx + 1);
								listNoFld = null;
							}
						}
					}
				}
			}
		}

		if(SchemaOrgClass.class.isAssignableFrom(cls)) {
			// クラス型のstringはnameと同じなのでJSON出力時は省略
			if(lcDclFldNameMap.containsKey("name") || lcGetMtdNameMap.containsKey("name")) {
				lcDclFldNameMap.remove("string");
				lcGetMtdNameMap.remove("string");
			}
		}

		// Listと単一オブジェクトが共存しているものを統合
		Map<String, Field> colistFldNameMap = new HashMap<>();
		Map<String, Method> colistMtdNameMap = new HashMap<>();
		try {
			for(Map.Entry<String, Field> ent : lcDclFldNameMap.entrySet()) {
				String lcDclFldNameList = ent.getKey();
				if(lcDclFldNameList.endsWith("list")) {
					String lcDclFldNameObj = lcDclFldNameList.substring(0, lcDclFldNameList.length() - 4);
					if(lcDclFldNameMap.containsKey(lcDclFldNameObj)) {
						// Comment,Reviewの特例を考え型チェックを入れない
						// Field fldObj = lcDclFldNameMap.get(lcDclFldNameObj);
						// Class<?> objCls = fldObj.getType();
						Field fldList = ent.getValue();
						// ParameterizedType gType = (ParameterizedType)fldList.getGenericType();
						// Type[] aTypes = gType.getActualTypeArguments();
						// Class<?> listCls = (Class<?>)aTypes[0];
						// if(objCls.equals(listCls)) {
							colistFldNameMap.put(lcDclFldNameObj, fldList);
						// }
					}
					if(lcGetMtdNameMap.containsKey(lcDclFldNameObj)) {
						// Method mtdObj = lcGetMtdNameMap.get(lcDclFldNameObj);
						// Class<?> objCls = mtdObj.getReturnType();
						Field fldList = ent.getValue();
						// ParameterizedType gType = (ParameterizedType)fldList.getGenericType();
						// Type[] aTypes = gType.getActualTypeArguments();
						// Class<?> listCls = (Class<?>)aTypes[0];
						// if(objCls.equals(listCls)) {
							colistFldNameMap.put(lcDclFldNameObj, fldList);
						// }
					}
				}
			}
			for(Map.Entry<String, Method> ent : lcGetMtdNameMap.entrySet()) {
				String lcGetMtdNameList = ent.getKey();
				if(lcGetMtdNameList.endsWith("list")) {
					String lcGetMtdNameObj = lcGetMtdNameList.substring(0, lcGetMtdNameList.length() - 4);
					if(lcGetMtdNameMap.containsKey(lcGetMtdNameObj)) {
						// Method mtdObj = lcGetMtdNameMap.get(lcGetMtdNameObj);
						// Class<?> objCls = mtdObj.getReturnType();
						Method mtdList = ent.getValue();
						// Type type = mtdList.getGenericReturnType();
						// ParameterizedType gType = (ParameterizedType)type;
						// Type[] aTypes = gType.getActualTypeArguments();
						// Class<?> listCls = (Class<?>)aTypes[0];
						// if(objCls.equals(listCls)) {
							colistMtdNameMap.put(lcGetMtdNameObj, mtdList);
						// }
					}
					if(lcDclFldNameMap.containsKey(lcGetMtdNameObj)) {
						// Field fldObj = lcDclFldNameMap.get(lcGetMtdNameObj);
						// Class<?> objCls = fldObj.getType();
						Method mtdList = ent.getValue();
						// Type type = mtdList.getGenericReturnType();
						// ParameterizedType gType = (ParameterizedType)type;
						// Type[] aTypes = gType.getActualTypeArguments();
						// Class<?> listCls = (Class<?>)aTypes[0];
						// if(objCls.equals(listCls)) {
							colistMtdNameMap.put(lcGetMtdNameObj, mtdList);
						// }
					}
				}
			}
			for(Map.Entry<String, Field> ent : colistFldNameMap.entrySet()) {
				String colistFldName = ent.getKey();
				Field fld = ent.getValue();
				fld.setAccessible(true);
				List<?> list = (List<?>)fld.get(obj);
				if(list != null && list.size() > 1) {
					lcDclFldNameMap.put(colistFldName, fld);
				}
				lcDclFldNameMap.remove(colistFldName + "list");
			}
			for(Map.Entry<String, Method> ent : colistMtdNameMap.entrySet()) {
				String colistMtdName = ent.getKey();
				Method mtd = ent.getValue();
				List<?> list = (List<?>)mtd.invoke(obj);
				if(list != null && list.size() > 1) {
					lcGetMtdNameMap.put(colistMtdName, mtd);
				}
				lcGetMtdNameMap.remove(colistMtdName + "list");
			}
		} catch(IllegalArgumentException iae) {
		} catch(IllegalAccessException iae) {
		} catch(InvocationTargetException ite) {
		}

		if(isJsonLdProperty) {
			try {
				// 実装が Action->agent->Person->* みたいになっている。PersonがJSON-LDに書かれないようにする。
				List<String> names = new ArrayList<>();
				for(String name : lcGetMtdNameMap.keySet()) {
					names.add(name);
				}
				for(String name : lcDclFldNameMap.keySet()) {
					if(!lcGetMtdNameMap.containsKey(name)) {
						names.add(name);
					}
				}
				Collections.sort(names);

				List<Object> valList = new ArrayList<>();
				List<Class<?>> clsList = new ArrayList<>();
				for(String name : names) {
					Object sv;
					Class<?> sc;
					boolean isList = false;
					if(lcGetMtdNameMap.containsKey(name)) {
						Method mtd = lcGetMtdNameMap.get(name);
						sv = mtd.invoke(obj);
						if(sv == null) {
							continue;
						}
						sc = mtd.getReturnType();
						if(List.class.isAssignableFrom(sc)) {
							Type type = mtd.getGenericReturnType();
							ParameterizedType gType = (ParameterizedType)type;
							Type[] aTypes = gType.getActualTypeArguments();
							if(aTypes.length > 0 && aTypes[0] instanceof Class) {
								sc = (Class<?>)aTypes[0];
								isList = true;
							}
						}
					} else {
						Field fld = lcDclFldNameMap.get(name);
						fld.setAccessible(true);
						sv = fld.get(obj);
						if(sv == null) {
							continue;
						}
						sc = fld.getType();
						if(List.class.isAssignableFrom(sc)) {
							ParameterizedType gType = (ParameterizedType)fld.getGenericType();
							Type[] aTypes = gType.getActualTypeArguments();
							if(aTypes.length > 0 && aTypes[0] instanceof Class) {
								sc = (Class<?>)aTypes[0];
								isList = true;
							}
						}
					}
					if(isList) {
						List<?> tmpList = (List<?>)sv;
						valList.addAll(tmpList);
						for(int ti = 0; ti < tmpList.size(); ti++) {
							clsList.add(sc);
						}
					} else {
						valList.add(sv);
						clsList.add(sc);
					}
				}

				if(valList.size() == 0) {
					return "null";
				} else {
					if(valList.size() > 1) {
						sb = new StringBuilder("[");
					} else {
						sb = new StringBuilder();
					}
					for(int ri = 0; ri < valList.size(); ri++) {
						Object rv = valList.get(ri);
						Class<?> rc = clsList.get(ri);
						String valStr = toValStr(rv, rc);
						appendWithCheck(rv, rc, ri, valStr, sb, depth, stack, isJsonLd);
						if(ri < valList.size() - 1) {
							sb.append(",");
						}
					}
					if(valList.size() > 1) {
						sb.append("]");
					}
					return sb.toString();
				}
			} catch(IllegalArgumentException iae) {
			} catch(IllegalAccessException iae) {
			} catch(InvocationTargetException ite) {
			}
		}

		HashMap<String, Method> prmMtdNameMap = new HashMap<>();
		HashMap<String, Field> prmFldNameMap = new HashMap<>();
		for(Map.Entry<String, Method> ent : lcGetMtdNameMap.entrySet()) {
			String lcGetMtdName = ent.getKey();
			Method mtd = ent.getValue();
			// 対応するフィールドがあれば名称にする
			if(lcDclFldNameMap.containsKey(lcGetMtdName)) {
				prmMtdNameMap.put(lcDclFldNameMap.get(lcGetMtdName).getName(), mtd);
				continue;
			}

			// アノテーションでキャメルケースが指定されていれば名称にする
			if(List.class.isAssignableFrom(mtd.getReturnType())) {
				Type type = mtd.getGenericReturnType();
				ParameterizedType gType = (ParameterizedType)type;
				Type[] aTypes = gType.getActualTypeArguments();
				if(aTypes.length > 0 && aTypes[0] instanceof Class) {
					Class<?> rtnCls = (Class<?>)aTypes[0];
					CamelizedName cmlName = rtnCls.getAnnotation(CamelizedName.class);
					if(cmlName != null) {
						prmMtdNameMap.put(cmlName.value() + "List", mtd);
						continue;
					}
				}
			} else {
				CamelizedName cmlName = mtd.getReturnType().getAnnotation(CamelizedName.class);
				if(cmlName != null) {
					prmMtdNameMap.put(cmlName.value(), mtd);
					continue;
				}
			}

			// メソッド名から生成する
			String getMtdName = mtd.getName().substring(3);
			Matcher cmlMc1 = cmlPt1.matcher(getMtdName);
			if(cmlMc1.matches()) {
				prmMtdNameMap.put(getMtdName.toLowerCase(), mtd);
				continue;
			}
			Matcher cmlMc2 = cmlPt2.matcher(getMtdName);
			if(cmlMc2.matches()) {
				prmMtdNameMap.put(cmlMc2.group(1).toLowerCase() + cmlMc2.group(2), mtd);
				continue;
			}
			Matcher cmlMc3 = cmlPt3.matcher(getMtdName);
			if(cmlMc3.matches()) {
				prmMtdNameMap.put(cmlMc3.group(1).toLowerCase() + cmlMc3.group(2), mtd);
				continue;
			}
		}
		for(Map.Entry<String, Field> ent : lcDclFldNameMap.entrySet()) {
			if(!lcGetMtdNameMap.containsKey(ent.getKey())) {
				prmFldNameMap.put(ent.getValue().getName(), ent.getValue());
			}
		}

		HashMap<String, Method> jsonLdMtdMap = new HashMap<>();
		HashMap<String, Field> jsonLdFldMap = new HashMap<>();
		if(isJsonLd) {
			// identifierは@idと解釈する
			if(prmMtdNameMap.containsKey("identifier")) {
				Method mtd = prmMtdNameMap.get("identifier");
				jsonLdMtdMap.put("@id", mtd);
				prmMtdNameMap.remove("identifier");
			} else if(prmFldNameMap.containsKey("identifier")) {
				Field fld = prmFldNameMap.get("identifier");
				jsonLdFldMap.put("@id", fld);
				prmFldNameMap.remove("identifier");
			}
		}

		// 出力パラメータに関して繰り返し
		List<String> prmNameList = new ArrayList<String>();
		for(Map.Entry<String, Method> ent : prmMtdNameMap.entrySet()) {
			prmNameList.add(ent.getKey());
		}
		for(Map.Entry<String, Field> ent : prmFldNameMap.entrySet()) {
			prmNameList.add(ent.getKey());
		}
		if(isJsonLd) {
			for(Map.Entry<String, Method> ent : jsonLdMtdMap.entrySet()) {
				prmNameList.add(ent.getKey());
			}
			for(Map.Entry<String, Field> ent : jsonLdFldMap.entrySet()) {
				prmNameList.add(ent.getKey());
			}
			for(Map.Entry<String, String> ent : jsonLdStrMap.entrySet()) {
				prmNameList.add(ent.getKey());
			}
		}
		Collections.sort(prmNameList);
		sb = new StringBuilder("{");
		int notNullCnt = 0;
		for(int pi = 0; pi < prmNameList.size(); pi++) {
			String prmName = prmNameList.get(pi);
			logger.trace("param: " + prmName);

			try {
				Object rv = null;
				Class<?> rc = null;
				if(prmMtdNameMap.containsKey(prmName)) {
					Method mtd = prmMtdNameMap.get(prmName);
					logger.trace("method: " + mtd);
					if(idx != null && listIndexMtd != null && listIndexMtd.equals(mtd)) {
						rv = listIndexVal;
					} else if(idx != null && listNoMtd != null && listNoMtd.equals(mtd)) {
						rv = listNoVal;
					} else {
						rv = mtd.invoke(obj);
					}
					rc = mtd.getReturnType();
				} else if(prmFldNameMap.containsKey(prmName)) {
					Field fld = prmFldNameMap.get(prmName);
					logger.trace("field: " + fld);
					fld.setAccessible(true);
					if(idx != null && listIndexFld != null && listIndexFld.equals(fld)) {
						rv = listIndexVal;
					} else if(idx != null && listNoFld != null && listNoFld.equals(fld)) {
						rv = listNoVal;
					} else {
						rv = fld.get(obj);
					}
					rc = fld.getType();
				} else {
					if(jsonLdMtdMap.containsKey(prmName)) {
						Method mtd = jsonLdMtdMap.get(prmName);
						logger.trace("method: " + mtd);
						rv = mtd.invoke(obj);
						rc = mtd.getReturnType();
					} else if(jsonLdFldMap.containsKey(prmName)) {
						Field fld = jsonLdFldMap.get(prmName);
						logger.trace("field: " + fld);
						fld.setAccessible(true);
						rv = fld.get(obj);
						rc = fld.getType();
					} else {
						rv = jsonLdStrMap.get(prmName);
						rc = String.class;
					}
				}
				if(rv == null) {
					// sb.append("null");
					continue;
				}

				String valStr2 = toValStr(rv, rc);
				if(valStr2 != null && valStr2.equals("null")) {
					continue;
				}
				notNullCnt++;

				if(notNullCnt > 1) {
					sb.append(",");
				}
				sb.append("\"");
				sb.append(escapeJson(prmName));
				sb.append("\"");
				sb.append(":");
				appendWithCheck(rv, rc, null, valStr2, sb, depth, stack, isJsonLd);
			} catch(Exception ex) {
				// sb.append("\"");
				// sb.append(escapeJson(ex.toString()));
				// sb.append("\"");
				logger.warn(ex.getMessage(), ex);
				logger.warn("objects trace:");
				stack.forEach(to -> logger.warn(" (" + to.getClass() + ") "));
			}
		}
		sb.append("}");

		return sb.toString();
	}

	private static void appendWithCheck(Object rv, Class<?> rc, Integer ri, String valStr, StringBuilder sb,
			int depth, LinkedList<Object> stack, boolean isJsonLd) {
		if(valStr == null) {
			boolean loop = false;
			for(Object to : stack) {
				if(to.equals(rv)) {
					loop = true;
					break;
				}
			}
			if(loop) {
				sb.append("null");
				logger.warn("object looping:");
				stack.forEach(to -> logger.warn(" (" + to.getClass() + ") "));
			} else if(depth == DEPTH_LIMIT) {
				sb.append("null");
				logger.warn("depth limit over:");
				stack.forEach(to -> logger.warn(" (" + to.getClass() + ") "));
			} else {
				sb.append(toJson(rv, rc, ri, depth + 1, new LinkedList<>(stack), isJsonLd));
			}
		} else {
			sb.append(valStr);
		}
	}

	private static String toValStr(Object rv, Class<?> rc) {
		StringBuilder sb = new StringBuilder();
		if(rv == null) {
			return "null";
		} else if(String.class.isAssignableFrom(rc)) {
			sb.append("\"");
			sb.append(escapeJson((String)rv));
			sb.append("\"");
		} else if(Boolean.class.isAssignableFrom(rc) || boolean.class.isAssignableFrom(rc)) {
			sb.append(rv.toString());
		} else if(Number.class.isAssignableFrom(rc) || int.class.isAssignableFrom(rc)
				|| long.class.isAssignableFrom(rc) || double.class.isAssignableFrom(rc)
				|| char.class.isAssignableFrom(rc) || byte.class.isAssignableFrom(rc)
				|| short.class.isAssignableFrom(rc) || float.class.isAssignableFrom(rc)) {
			sb.append(rv.toString());
		} else if(OffsetDateTime.class.isAssignableFrom(rc)) {
			DateTimeFormatter ymdhmszDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
			OffsetDateTime odt = (OffsetDateTime)rv;
			sb.append("\"");
			sb.append(odt.format(ymdhmszDtf));
			sb.append("\"");
		} else if(LocalDateTime.class.isAssignableFrom(rc)) {
			DateTimeFormatter ymdhmsDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
			LocalDateTime ldt = (LocalDateTime)rv;
			sb.append("\"");
			sb.append(ldt.format(ymdhmsDtf));
			sb.append("\"");
		} else if(OffsetTime.class.isAssignableFrom(rc)) {
			DateTimeFormatter hmszDtf = DateTimeFormatter.ofPattern("HH:mm:ssXXX");
			OffsetTime ot = (OffsetTime)rv;
			sb.append("\"");
			sb.append(ot.format(hmszDtf));
			sb.append("\"");
		} else if(LocalDate.class.isAssignableFrom(rc)) {
			DateTimeFormatter ymdDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate ld = (LocalDate)rv;
			sb.append("\"");
			sb.append(ld.format(ymdDtf));
			sb.append("\"");
		} else if(LocalTime.class.isAssignableFrom(rc)) {
			DateTimeFormatter hmsDtf = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalTime lt = (LocalTime)rv;
			sb.append("\"");
			sb.append(lt.format(hmsDtf));
			sb.append("\"");
		} else if(Calendar.class.isAssignableFrom(rc)) {
			SimpleDateFormat ymdhmszSdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
			Calendar cal = (Calendar)rv;
			java.util.Date date = cal.getTime();
			TimeZone tz = cal.getTimeZone();
			ymdhmszSdf.setTimeZone(tz);
			sb.append("\"");
			sb.append(ymdhmszSdf.format(date));
			sb.append("\"");
		} else if(java.sql.Date.class.isAssignableFrom(rc)) {
			SimpleDateFormat ymdSdf = new SimpleDateFormat("yyyy-MM-dd");
			java.sql.Date date = (java.sql.Date)rv;
			sb.append("\"");
			sb.append(ymdSdf.format(date));
			sb.append("\"");
		} else if(java.sql.Time.class.isAssignableFrom(rc)) {
			SimpleDateFormat hmsSdf = new SimpleDateFormat("HH:mm:ss");
			java.sql.Time time = (java.sql.Time)rv;
			sb.append("\"");
			sb.append(hmsSdf.format(time));
			sb.append("\"");
		} else if(java.util.Date.class.isAssignableFrom(rc)) {
			SimpleDateFormat ymdhmsSdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			java.util.Date date = (java.util.Date)rv;
			sb.append("\"");
			sb.append(ymdhmsSdf.format(date));
			sb.append("\"");
		} else if(ConsistentDataType.Text.class.isAssignableFrom(rc)) {
			String string = ((ConsistentDataType.Text)rv).getString();
			if(string == null) {
				sb.append("null");
			} else {
				sb.append("\"");
				sb.append(escapeJson(string));
				sb.append("\"");
			}
		} else if(ConsistentDataType.Boolean.class.isAssignableFrom(rc)) {
			java.lang.Boolean b00lean = ((ConsistentDataType.Boolean)rv).getB00lean();
			sb.append(b00lean == null ? "null" : b00lean.toString());
		} else if(ConsistentDataType.DateTime.class.isAssignableFrom(rc)) {
			ConsistentDataType.DateTime dateTime = (ConsistentDataType.DateTime)rv;
			OffsetDateTime odt = dateTime.getDateTime();
			if(odt == null) {
				sb.append("null");
			} else {
				DateTimeFormatter ymdhmszDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
				sb.append("\"");
				sb.append(odt.format(ymdhmszDtf));
				sb.append("\"");
			}
		} else if(ConsistentDataType.Date.class.isAssignableFrom(rc)) {
			ConsistentDataType.Date date = (ConsistentDataType.Date)rv;
			LocalDate ld = date.getDate();
			if(ld == null) {
				sb.append("null");
			} else {
				DateTimeFormatter ymdDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				sb.append("\"");
				sb.append(ld.format(ymdDtf));
				sb.append("\"");
			}
		} else if(ConsistentDataType.Time.class.isAssignableFrom(rc)) {
			ConsistentDataType.Time time = (ConsistentDataType.Time)rv;
			LocalTime lt = time.getTime();
			if(lt == null) {
				sb.append("null");
			} else {
				DateTimeFormatter hmsDtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				sb.append("\"");
				sb.append(lt.format(hmsDtf));
				sb.append("\"");
			}
		} else if(ConsistentDataType.Number.class.isAssignableFrom(rc)) {
			java.lang.Number number = ((ConsistentDataType.Number)rv).getNumber();
			sb.append(number == null ? "null" : number.toString());
		} else if(ConsistentDataType.Integer.class.isAssignableFrom(rc)) {
			Long l0ng = ((ConsistentDataType.Integer)rv).getL0ng();
			sb.append(l0ng == null ? "null" : l0ng.toString());
		} else if(ConsistentDataType.Float.class.isAssignableFrom(rc)) {
			Double d0uble = ((ConsistentDataType.Float)rv).getD0uble();
			sb.append(d0uble == null ? "null" : d0uble.toString());
		} else {
			return null;
		}

		return sb.toString();
	}

	private static final Pattern jsonEscpPt = Pattern.compile("(\"|\\\\|/|\b|\f|\n|\r|\t"
			+ "|\\x00|\\x01|\\x02|\\x03|\\x04|\\x05|\\x06|\\x07|\\x11|\\x0e|\\x0f"
			+ "|\\x10|\\x11|\\x12|\\x13|\\x14|\\x15|\\x16|\\x17"
			+ "|\\x18|\\x19|\\x1a|\\x1b|\\x1c|\\x1d|\\x1e|\\x1f)");
	private static final Map<String, String> JSON_ESCAPE_CHARS = new HashMap<String, String>();
	static {
		JSON_ESCAPE_CHARS.put("\"", "\\\\\"");
		JSON_ESCAPE_CHARS.put("\\", "\\\\\\\\");
		JSON_ESCAPE_CHARS.put("/", "\\\\/");
		JSON_ESCAPE_CHARS.put("\b", "\\\\b");
		JSON_ESCAPE_CHARS.put("\f", "\\\\f");
		JSON_ESCAPE_CHARS.put("\n", "\\\\n");
		JSON_ESCAPE_CHARS.put("\r", "\\\\r");
		JSON_ESCAPE_CHARS.put("\t", "\\\\t");
		for(char ch = 0; ch <= 0x1f; ch++) {
			if(!JSON_ESCAPE_CHARS.containsKey("" + ch)) {
				JSON_ESCAPE_CHARS.put("" + ch, "\\\\u00" + String.format("%02x", (int)ch));
			}
		}
	}

	/**
	 * Escapes a string for JSON value.
	 *
	 * @param str a string to escape
	 * @return the escaped string
	 */
	public static String escapeJson(String str) {
		if(str == null) {
			return null;
		}

		Matcher jsonEscpMc = jsonEscpPt.matcher(str);
		StringBuffer sb = new StringBuffer();
		while(jsonEscpMc.find()) {
			String mcStr = jsonEscpMc.group(1);
			String rpcStr = JSON_ESCAPE_CHARS.get(mcStr);
			jsonEscpMc.appendReplacement(sb, rpcStr);
		}
		jsonEscpMc.appendTail(sb);

		return sb.toString();
	}

}
