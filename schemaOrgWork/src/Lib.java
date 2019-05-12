import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;

public class Lib {

	public static void retrieve(File pd, Map<String, ImplData> implDataMap,
			Map<String, String> impl2Ifc, Map<String, Set<String>> ifc2Impl)
			throws IOException, ClassNotFoundException {
		File[] fl = pd.listFiles();
		for(File f: fl) {
			if(f.canRead()) {
				if(f.isDirectory()) {
					retrieve(f, implDataMap, impl2Ifc, ifc2Impl);
				} else {
					processFile(f, implDataMap, impl2Ifc, ifc2Impl);
				}
			}
		}
	}

	private static void processFile(File inFile, Map<String, ImplData> implDataMap,
			Map<String, String> impl2Ifc, Map<String, Set<String>> ifc2Impl)
			throws IOException, ClassNotFoundException {
		String tgtStr = inFile.getCanonicalPath().replaceAll(Pattern.quote(File.separator), "/");
		Matcher cfmc = GenerateImpl.cfpt.matcher(tgtStr);
		if(!cfmc.find()) {
			return;
		}

		String pkg = cfmc.group(1).replaceAll("/", ".");
		String extension = cfmc.group(2);
		String type = cfmc.group(3);
		String typeName = pkg + "." + extension + "." + type;
		Class<?> cls = GenerateImpl.class.getClassLoader().loadClass(typeName);
		String typePkg = pkg + "." + extension;
		System.out.println(cls.getName());

		String orgType = type;
		if((type.equals("Clazz") || type.equals("Container"))
				|| (orgType.equals("DataType") || orgType.equals("Container"))) {
			type = "Impl";
			typeName = pkg + "." + extension + "." + type;
		}

		Class<?>[] ifcs = cls.getClasses();
		for(Class<?> ifc : ifcs) {
			System.out.println(ifc.getName());
			if(ifc.isInterface()) {
				// インターフェースの情報取得
				ImplData implData = null;
				String implSmplName = ifc.getAnnotation(ConstantizedName.class).value();
				String implName = typePkg + "." + StringUtils.uncapitalize(type)
						+ "." + implSmplName;
				if((orgType.equals("Clazz") || orgType.equals("Container"))
						|| (orgType.equals("DataType") || orgType.equals("Container"))) {
					if(implDataMap.containsKey(implName)) {
						implData = implDataMap.get(implName);
						implData.orgTypes.add(orgType);
					}
				}
				if(implData == null) {
					implData = new ImplData();
					implData.extension = extension;
					implData.typePkg = typePkg;
					implData.type = type;
					implData.typeName = typeName;
					implData.orgTypes.add(orgType);
					implData.ifcName = ifc.getName();
					implData.ifcSmplName = ifc.getSimpleName();
					implData.ifcSmplCml = ifc.getAnnotation(CamelizedName.class).value();
					implData.allIfcSet.add(implData.ifcName);
					implData.implName = implName;
					implData.implSmplName = implSmplName;
					implDataMap.put(implName, implData);

					impl2Ifc.put(implName, implData.ifcName);
					Set<String> tmpSet = null;
					if(ifc2Impl.containsKey(implData.ifcName)) {
						tmpSet = ifc2Impl.get(implData.ifcName);
					} else {
						tmpSet = new HashSet<>();
						ifc2Impl.put(implData.ifcName, tmpSet);
					}
					tmpSet.add(implName);
				}

				Lib.retrieveInterfaces(ifc, implData, 0, -1);
			}
		}
	}

	public static void retrieveInterfaces(Class<?> cls, ImplData implData, int gi, int gm)
			throws ClassNotFoundException {
		Map<String, Method[]> gsMap = implData.gsMap;
		Map<String, Method> oMap = implData.oMap;
		Map<String, Class<?>> pMap = implData.pMap;
		List<String> ifcTree = implData.ifcTree;
		implData.allIfcSet.add(cls.getName());

		// インデントをつけてデバッグ出力
		String sps = StringUtils.repeat(" ", gi);
		System.out.println(sps + cls.getName());
		ifcTree.add(sps + cls.getName());

		Method[] mtds = cls.getMethods();
		for(Method mtd : mtds) {
			// System.out.println(sps + "  " + mtd.getName());
			String mname = mtd.getName();
			if(mname.startsWith("get")) {
				String pname = mname.substring(3).toLowerCase();
				if(gsMap.containsKey(pname)) {
					Method[] ms = gsMap.get(pname);
					if(ms[0] == null) {
						ms[0] = mtd;
						addPropertyList(cls, mtd, pMap);
					} else if(ms[0].getReturnType().equals(mtd.getReturnType())) {
					} else {
						// System.out.println("odd returnType. (" + mname + ")");
						// System.exit(1);
					}
				} else {
					addPropertyList(cls, mtd, pMap);
					gsMap.put(pname, new Method[] { mtd, null });
				}
			} else if(mname.startsWith("set")) {
				String pname = mname.substring(3).toLowerCase();
				if(gsMap.containsKey(pname)) {
					Method[] ms = gsMap.get(pname);
					ms[1] = mtd;
				} else {
					gsMap.put(pname, new Method[] { null, mtd });
				}
			} else {
				oMap.put(mname, mtd);
			}
		}

		if(gm < 0 || gi < gm) {
			Class<?>[] ifcs = cls.getInterfaces();
			for(Class<?> ifc : ifcs) {
				retrieveInterfaces(ifc, implData, gi + 1, gm);
			}
		}
	}

	private static void addPropertyList(Class<?> cls, Method mtd,
			Map<String, Class<?>> pMap) throws ClassNotFoundException {
		if((!org.kyojo.schemaorg.m3n5.core.DataType.Text.class.isAssignableFrom(cls)
				&& (mtd.getName().equals("getString") || mtd.getName().equals("setString")))
			|| mtd.getName().equals("getNativeValue")) {
		} else if(mtd.getName().equals("getNativeValue")) {
		} else if(mtd.getName().equals("getSeq")) {
			pMap.put("seq", Long.class);
		} else if(mtd.getName().equals("getRefSeq")) {
			pMap.put("refSeq", Long.class);
		} else if(mtd.getName().equals("getRefAcr")) {
			pMap.put("refAcr", String.class);
		} else if(mtd.getName().equals("getCreatedAt")) {
			pMap.put("createdAt", java.util.Date.class);
		} else if(mtd.getName().equals("getCreatedBy")) {
			pMap.put("createdBy", Long.class);
		} else if(mtd.getName().equals("getUpdatedAt")) {
			pMap.put("updatedAt", java.util.Date.class);
		} else if(mtd.getName().equals("getUpdatedBy")) {
			pMap.put("updatedBy", Long.class);
		} else if(mtd.getName().equals("getExpiredAt")) {
			pMap.put("expiredAt", java.util.Date.class);
		} else if(mtd.getName().equals("getExpiredBy")) {
			pMap.put("expiredBy", Long.class);
		} else if(mtd.getReturnType().getSimpleName().equals("List")) {
			Type type = mtd.getGenericReturnType();
			System.out.println(type.toString());
			ParameterizedType gType = (ParameterizedType)type;
			Type[] aTypes = gType.getActualTypeArguments();
			Class<?> rtnCls = (Class<?>)aTypes[0];
			pMap.put(rtnCls.getName(), rtnCls);
		} else {
			Class<?> rtnCls = mtd.getReturnType();
			pMap.put(rtnCls.getName(), rtnCls);
		}
	}

	public static void retrieveContainedTypes(String tgt,
			Set<String> gsonBasicSet, Set<String> gsonBasicSet2,
			Map<String, ImplData> implDataMap, Map<String, Set<String>> ifc2Impl,
			Map<String, Set<String>> subSetMap) throws ClassNotFoundException {
		if(gsonBasicSet2.contains(tgt)) return;

		if(ifc2Impl.containsKey(tgt)) {
			gsonBasicSet2.add(tgt);

			Set<String> implSet = ifc2Impl.get(tgt);
			for(String implName : implSet) {
				ImplData implData = implDataMap.get(implName);
				for(Map.Entry<String, Class<?>> ent : implData.pMap.entrySet()) {
					// gsonBasicSet2.add(ent.getKey());
					if(subSetMap.containsKey(ent.getKey())) {
						gsonBasicSet.addAll(subSetMap.get(ent.getKey()));
					}
					retrieveContainedTypes(ent.getKey(), gsonBasicSet, gsonBasicSet2,
							implDataMap, ifc2Impl, subSetMap);
				}

				for(String gsonTypeName : implData.gsonTypeNameMap.keySet()) {
					gsonBasicSet.add(gsonTypeName);
				}
			}
		}
	}

}
