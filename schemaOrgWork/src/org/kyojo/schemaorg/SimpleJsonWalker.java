package org.kyojo.schemaorg;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.kyojo.schemaorg.JsonOffsetElement.JsonArrayPhase;
import org.kyojo.schemaorg.JsonOffsetElement.JsonElementType;
import org.kyojo.schemaorg.JsonOffsetElement.JsonObjectPhase;

public class SimpleJsonWalker {

	private static final Log logger = LogFactory.getLog(SimpleJsonWalker.class);

	public static boolean breakDownJson(String json, JsonOffsetElement joe) {
		if(json == null) {
			logger.warn("null arg");
			return false;
		}

		int start = 0;
		for(; start < json.length(); start++) {
			char ch = json.charAt(start);
			if(!isMarginChar(ch)) {
				break;
			}
		}

		if(start == json.length()) {
			logger.warn("blank arg");
			return false;
		}

		int end = json.length() - 1;
		for(; end >= 0; end--) {
			char ch = json.charAt(end);
			if(!isMarginChar(ch)) {
				break;
			}
		}

		char ch = json.charAt(start);
		if(ch == '{') {
			return walkObject(json, start, joe);
		} else if(ch == '[') {
			return walkArray(json, start, joe);
		} else if(ch == '"') {
			return walkString(json, start, joe);
		} else {
			return walkValue(json, start, joe);
		}
	}

	private static boolean walkObject(String json, int ofs, JsonOffsetElement joe) {
		joe.type = JsonElementType.V_OBJECT;
		joe.start = ofs;

		JsonOffsetElement child;
		JsonObjectPhase phase = JsonObjectPhase.LEFT;
		boolean keyIsId = false;
		boolean keyIsType = false;
		for(int pos = ofs + 1; pos < json.length(); pos++) {
			char ch = json.charAt(pos);
			if(isMarginChar(ch)) {
				child = new JsonOffsetElement();
				if(!walkMargin(json, pos, child)) {
					return false;
				}
				pos = child.end;
				joe.children.add(child);
			} else if(ch == '}') {
				if(phase != JsonObjectPhase.LEFT && phase != JsonObjectPhase.VALUE) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				phase = JsonObjectPhase.RIGHT;
				joe.end = pos;
				break;
			} else if(ch == ':') {
				if(phase != JsonObjectPhase.KEY) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				child.type = JsonElementType.COLON;
				child.start = child.end = pos;
				phase = child.objectPhase = JsonObjectPhase.COLON;
				joe.children.add(child);
			} else if(ch == ',') {
				if(phase != JsonObjectPhase.VALUE) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				child.type = JsonElementType.COMMA;
				child.start = child.end = pos;
				phase = child.objectPhase = JsonObjectPhase.COMMA;
				joe.children.add(child);
				keyIsId = false;
				keyIsType = false;
			} else if(ch == '{') {
				if(phase != JsonObjectPhase.COLON) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkObject(json, pos, child)) {
					return false;
				}
				phase = child.objectPhase = JsonObjectPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				joe.lastValueIndex = joe.children.size() - 1;
			} else if(ch == '[') {
				if(phase != JsonObjectPhase.COLON) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkArray(json, pos, child)) {
					return false;
				}
				phase = child.objectPhase = JsonObjectPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				joe.lastValueIndex = joe.children.size() - 1;
			} else if(ch == '"') {
				if(phase != JsonObjectPhase.LEFT
						&& phase != JsonObjectPhase.COLON && phase != JsonObjectPhase.COMMA) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkString(json, pos, child)) {
					return false;
				}
				if(phase == JsonObjectPhase.COLON) {
					phase = child.objectPhase = JsonObjectPhase.VALUE;
					if(keyIsId) {
						joe.jsonLdId = json.substring(child.start + 1, child.end);
					} else if(keyIsType) {
						joe.jsonLdType = json.substring(child.start + 1, child.end);
					}
				} else {
					phase = child.objectPhase = JsonObjectPhase.KEY;
					String key = json.substring(child.start + 1, child.end);
					if(key.equals("@id")) {
						keyIsId = true;
					} else if(key.equals("@type")) {
						keyIsType = true;
					}
				}
				pos = child.end;
				joe.children.add(child);
				if(joe.firstValueIndex == null) {
					joe.firstValueIndex = joe.children.size() - 1;
				}
				joe.lastValueIndex = joe.children.size() - 1;
			} else {
				if(phase != JsonObjectPhase.COLON) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkValue(json, pos, child)) {
					return false;
				}
				phase = child.objectPhase = JsonObjectPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				joe.lastValueIndex = joe.children.size() - 1;
			}
		}

		if(joe.end == null) {
			logger.warn("not terminated: pos=" + ofs + ", around=" + clipAround(json, ofs));
			return false;
		} else {
			return true;
		}
	}

	private static boolean walkArray(String json, int ofs, JsonOffsetElement joe) {
		joe.type = JsonElementType.V_ARRAY;
		joe.start = ofs;

		JsonOffsetElement child;
		JsonArrayPhase phase = JsonArrayPhase.LEFT;
		boolean hasOnlyString = false;
		boolean notOnlyString = false;
		for(int pos = ofs + 1; pos < json.length(); pos++) {
			char ch = json.charAt(pos);
			if(isMarginChar(ch)) {
				child = new JsonOffsetElement();
				if(!walkMargin(json, pos, child)) {
					return false;
				}
				pos = child.end;
				joe.children.add(child);
			} else if(ch == ']') {
				if(phase != JsonArrayPhase.LEFT && phase != JsonArrayPhase.VALUE) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				phase = JsonArrayPhase.RIGHT;
				joe.end = pos;
				break;
			} else if(ch == ',') {
				if(phase != JsonArrayPhase.VALUE) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				child.type = JsonElementType.COMMA;
				child.start = child.end = pos;
				phase = child.arrayPhase = JsonArrayPhase.COMMA;
				joe.children.add(child);
			} else if(ch == '{') {
				if(phase != JsonArrayPhase.LEFT && phase != JsonArrayPhase.COMMA) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkObject(json, pos, child)) {
					return false;
				}
				phase = child.arrayPhase = JsonArrayPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				if(joe.firstValueIndex == null) {
					joe.firstValueIndex = joe.children.size() - 1;
				}
				joe.lastValueIndex = joe.children.size() - 1;
				notOnlyString = true;
			} else if(ch == '[') {
				if(phase != JsonArrayPhase.LEFT && phase != JsonArrayPhase.COMMA) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkArray(json, pos, child)) {
					return false;
				}
				phase = child.arrayPhase = JsonArrayPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				if(joe.firstValueIndex == null) {
					joe.firstValueIndex = joe.children.size() - 1;
				}
				joe.lastValueIndex = joe.children.size() - 1;
				notOnlyString = true;
			} else if(ch == '"') {
				if(phase != JsonArrayPhase.LEFT && phase != JsonArrayPhase.COMMA) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkString(json, pos, child)) {
					return false;
				}
				phase = child.arrayPhase = JsonArrayPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				if(joe.firstValueIndex == null) {
					joe.firstValueIndex = joe.children.size() - 1;
				}
				joe.lastValueIndex = joe.children.size() - 1;
				hasOnlyString = true;
			} else {
				if(phase != JsonArrayPhase.LEFT && phase != JsonArrayPhase.COMMA) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkValue(json, pos, child)) {
					return false;
				}
				phase = child.arrayPhase = JsonArrayPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				if(joe.firstValueIndex == null) {
					joe.firstValueIndex = joe.children.size() - 1;
				}
				joe.lastValueIndex = joe.children.size() - 1;
				notOnlyString = true;
			}
		}
		joe.onlyString = hasOnlyString && !notOnlyString;

		if(joe.end == null) {
			logger.warn("not terminated: pos=" + ofs);
			return false;
		} else {
			return true;
		}
	}

	private static boolean walkString(String json, int ofs, JsonOffsetElement joe) {
		joe.type = JsonElementType.V_STRING;
		joe.start = ofs;

		int escpCnt = 0;
		for(int pos = ofs + 1; pos < json.length(); pos++) {
			char ch = json.charAt(pos);
			if(ch == '"' && escpCnt % 2 == 0) {
				joe.end = pos;
				joe.onlyString = true;
				return true;
			}
			if(ch == '\\') {
				escpCnt++;
			} else {
				escpCnt = 0;
			}
		}

		logger.warn("not terminated: pos=" + ofs + ", around=" + clipAround(json, ofs));
		return false;
	}

	private static Pattern numPt = Pattern.compile("\\-?\\d+(?:\\.\\d+|)(?:[eE][\\-\\+]?\\d+|)");

	private static boolean walkValue(String json, int ofs, JsonOffsetElement joe) {
		joe.start = ofs;

		if(json.length() - ofs >= 4) {
			String str = json.substring(ofs, ofs + 4);
			if(str.equals("false")) {
				joe.type = JsonElementType.V_FALSE;
			} else if(str.equals("null")) {
				joe.type = JsonElementType.V_NULL;
			} else if(str.equals("true")) {
				joe.type = JsonElementType.V_TRUE;
			}
			if(joe.type != null) {
				joe.end = ofs + 3;
				return true;
			}
		}

		Matcher numMc = numPt.matcher(json);
		numMc.region(ofs, json.length());
		if(numMc.lookingAt()) {
			joe.type = JsonElementType.V_NUMBER;
			joe.end = ofs + numMc.group().length() - 1;
			return true;
		}

		logger.warn("invalid value: pos=" + ofs + ", around=" + clipAround(json, ofs));
		return false;
	}

	private static boolean walkMargin(String json, int ofs, JsonOffsetElement joe) {
		joe.type = JsonElementType.MARGIN;
		joe.start = ofs;

		for(int pos = ofs + 1; pos < json.length(); pos++) {
			char ch = json.charAt(pos);
			if(!isMarginChar(ch)) {
				joe.end = pos - 1;
				break;
			}
		}

		if(joe.end == null) {
			joe.end = json.length() - 1;
		}
		return true;
	}

	public static boolean isMarginChar(char ch) {
		switch(ch) {
		case ' ':
		case '\t':
		case '\r':
		case '\n':
			return true;
		default:
			return false;
		}
	}

	public static String clipAround(String text, int pos) {
		final int LEN = 15;
		int begin = pos - LEN;
		if(begin < 0) begin = 0;
		int end = pos + LEN;
		if(end >= text.length()) end = text.length();
		return text.substring(begin, pos) + "!!here!!" + text.substring(pos, end);
	}

	/**
	 * Formats the given JSON string
	 *
	 * @param json the JSON string to format
	 * @param indent the indentation string per one depth
	 * @return JSON string
	 */
	public static String formatJson(String json, String indent) {
		JsonOffsetElement joe = new JsonOffsetElement();
		boolean res = breakDownJson(json, joe);
		if(res) {
			StringBuilder sb = new StringBuilder();
			formatJsonSub(json, joe, true, true, false, false, 0, "\t", sb);
			return sb.toString();
		} else {
			logger.warn("couldn't parse: " + json);
			return null;
		}
	}

	protected static void formatJsonSub(String json, JsonOffsetElement joe,
			boolean isFirst, boolean isLast, boolean isLeft, boolean isRight,
			int depth, String indent, StringBuilder sb) {
		if(joe.children.size() == 0) {
			if(joe.type != JsonElementType.MARGIN) {
				insertIndent(joe, isFirst, isLast, false, false, depth, indent, sb);
				sb.append(json.substring(joe.start, joe.end + 1));
				insertNewLine(joe, isFirst, isLast, false, false, depth, indent, sb);
			}
		} else {
			if(joe.type != JsonElementType.MARGIN) {
				insertIndent(joe, isFirst, isLast, true, false, depth, indent, sb);
				int firstStart = joe.children.get(0).start;
				sb.append(json.substring(joe.start, firstStart));
				insertNewLine(joe, isFirst, isLast, true, false, depth, indent, sb);
			}

			int depthInc = 0;
			if(joe.type != JsonElementType.MARGIN) {
				depthInc++;
			}
			for(int ci = 0; ci < joe.children.size(); ci++) {
				JsonOffsetElement child = joe.children.get(ci);
				formatJsonSub(json, child,
						ci == joe.firstValueIndex, ci == joe.lastValueIndex,
						false, false, depth + depthInc, indent, sb);
			}

			if(joe.type != JsonElementType.MARGIN) {
				insertIndent(joe, isFirst, isLast, false, true, depth, indent, sb);
				int lastEnd = joe.children.get(joe.children.size() - 1).end;
				sb.append(json.substring(lastEnd + 1, joe.end + 1));
				insertNewLine(joe, isFirst, isLast, false, true, depth, indent, sb);
			}
		}
	}

	protected static void insertIndent(JsonOffsetElement joe,
			boolean isFirst, boolean isLast, boolean isLeft, boolean isRight,
			int depth, String indent, StringBuilder sb) {
		if(indent == null) return;

		if(joe.objectPhase == JsonObjectPhase.COMMA
				|| joe.arrayPhase == JsonArrayPhase.COMMA) {
		} else if(!isRight && (joe.objectPhase == JsonObjectPhase.COLON
					|| joe.objectPhase == JsonObjectPhase.VALUE)) {
			sb.append(" ");
		} else {
			for(int ii = 0; ii < depth; ii++) {
				sb.append(indent);
			}
		}
	}

	protected static void insertNewLine(JsonOffsetElement joe,
			boolean isFirst, boolean isLast, boolean isLeft, boolean isRight,
			int depth, String indent, StringBuilder sb) {
		if(indent == null) return;

		if(joe.objectPhase == JsonObjectPhase.VALUE
				|| joe.arrayPhase == JsonArrayPhase.VALUE) {
			if(isLast || isLeft) {
				sb.append('\n');
				return;
			}
		} else if(joe.objectPhase != JsonObjectPhase.KEY
				&& joe.objectPhase != JsonObjectPhase.COLON) {
			sb.append('\n');
		}
	}

	public enum JsonLdThingStringGiven {
		AS_TEXT,
		AS_URL,
		AS_NAME,
		AS_INHERIT,
		AS_THING_NAME,
		AS_THING_URL,
		AS_THING_IDENTIFIER_TEXT,
		AS_THING_IDENTIFIER_URL
	}

	public enum JsonLdAtIdStringGiven {
		AS_TEXT,
		AS_URL,
		AS_AUTO
	}

	/**
	 * Converts the given JSON-Ld string to JSON
	 *
	 * @param jsonLd the JSON-Ld string to convert
	 * @param jsonLdRootMap the map to store JSON-Ld's key-values on the root
	 * @param thingStrModeMap the definition to interpret a string as schema.org's Thing subclasses
	 * @param atIdMode the definition to interpret JSON-Ld's {@literal @}id as schema.org's identifier property
	 * @return JSON string
	 */
	public static String jsonLdToJson(String jsonLd, Map<String, String> jsonLdRootMap,
			Map<String, JsonLdThingStringGiven> thingStrModeMap, JsonLdAtIdStringGiven atIdMode) {
		JsonOffsetElement joe = new JsonOffsetElement();
		boolean res = breakDownJson(jsonLd, joe);
		if(res) {
			if(joe.type != JsonElementType.V_OBJECT) {
				logger.warn("not object: " + jsonLd);
				return null;
			}

			StringBuilder sb = new StringBuilder();
			jsonLdToJsonSub(jsonLd, joe, jsonLdRootMap, null, thingStrModeMap, atIdMode, 0, sb);

			return sb.toString();
		} else {
			logger.warn("couldn't parse: " + jsonLd);
			return null;
		}
	}

	protected static void jsonLdToJsonSub(String jsonLd, JsonOffsetElement joe,
			Map<String, String> jsonLdRootMap, String parentKey,
			Map<String, JsonLdThingStringGiven> thingStrModeMap,
			JsonLdAtIdStringGiven atIdMode, int depth, StringBuilder sb) {
		if(joe.children.size() == 0) {
			if(joe.type != JsonElementType.MARGIN) {
				if(thingStrModeMap != null && parentKey != null
						&& thingStrModeMap.containsKey(parentKey)
						&& joe.type == JsonElementType.V_STRING
						&& (joe.objectPhase == JsonObjectPhase.VALUE)) {
					JsonLdThingStringGiven thingStrMode = thingStrModeMap.get(parentKey);
					int outer = 0;
					switch(thingStrMode) {
					case AS_THING_IDENTIFIER_TEXT:
					case AS_THING_IDENTIFIER_URL:
					case AS_THING_NAME:
						sb.append("{\"thing\":");
						outer++;
						break;
					default:
						break;
					}
					switch(thingStrMode) {
					case AS_THING_IDENTIFIER_TEXT:
					case AS_THING_IDENTIFIER_URL:
						sb.append("{\"identifier\":");
						outer++;
						break;
					default:
						break;
					}
					sb.append("{\"");
					switch(thingStrMode) {
					case AS_INHERIT:
						sb.append(parentKey);
						break;
					case AS_NAME:
					case AS_THING_NAME:
						sb.append("name");
						break;
					case AS_URL:
					case AS_THING_IDENTIFIER_URL:
						sb.append("url");
						break;
					case AS_TEXT:
					case AS_THING_IDENTIFIER_TEXT:
					default:
						sb.append("text");
						break;
					}
					sb.append("\":");
					sb.append(jsonLd.substring(joe.start, joe.end + 1));
					sb.append("}");
					for(int oi = 0; oi < outer; oi++) {
						sb.append("}");
					}
				} else {
					sb.append(jsonLd.substring(joe.start, joe.end + 1));
				}
			}
		} else {
			Map<String, List<Map<String, JsonOffsetElement>>> propListMap = null;
			Map<String, List<Map<String, String>>> propJsonLdMap = null;
			if(joe.type == JsonElementType.V_OBJECT) {
				if(joe.jsonLdType != null) {
					propListMap = new HashMap<>();
					propJsonLdMap = new HashMap<>();

					addJsonLdPropertyToJsonMap(jsonLd, joe, jsonLdRootMap,
							thingStrModeMap, atIdMode, depth + 1, propListMap, propJsonLdMap);
				}
			} else if(joe.type == JsonElementType.V_ARRAY) {
				for(JsonOffsetElement child : joe.children) {
					if(child.jsonLdType != null) {
						if(propListMap == null) {
							propListMap = new HashMap<>();
							propJsonLdMap = new HashMap<>();
						}

						addJsonLdPropertyToJsonMap(jsonLd, child, jsonLdRootMap,
								thingStrModeMap, atIdMode, depth + 1, propListMap, propJsonLdMap);
					}
				}
			}

			if(propListMap == null) {
				boolean jsonLdOnlyStringArray = false;
				if(parentKey != null && joe.type == JsonElementType.V_ARRAY
						&& joe.onlyString && thingStrModeMap.containsKey(parentKey)) {
					jsonLdOnlyStringArray = true;
					sb.append("{\"");
					switch(thingStrModeMap.get(parentKey)) {
					case AS_TEXT:
						sb.append("text");
						break;
					case AS_URL:
						sb.append("url");
						break;
					case AS_NAME:
						sb.append("name");
						break;
					case AS_INHERIT:
					default:
						sb.append(parentKey);
						break;
					}
					sb.append("\":");
				}

				if(joe.type != JsonElementType.MARGIN) {
					int firstStart = joe.children.get(0).start;
					sb.append(jsonLd.substring(joe.start, firstStart));
				}

				for(int ci = 0; ci < joe.children.size(); ci++) {
					JsonOffsetElement child = joe.children.get(ci);
					jsonLdToJsonSub(jsonLd, child, jsonLdRootMap, parentKey,
							thingStrModeMap, atIdMode, depth + 1, sb);
				}

				if(joe.type != JsonElementType.MARGIN) {
					int lastEnd = joe.children.get(joe.children.size() - 1).end;
					sb.append(jsonLd.substring(lastEnd + 1, joe.end + 1));
				}

				if(jsonLdOnlyStringArray) {
					sb.append("}");
				}
			} else {
				if(depth > 0) {
					sb.append("{");
				}

				int pc = 0;
				for(Entry<String, List<Map<String, JsonOffsetElement>>> propListEnt : propListMap.entrySet()) {
					pc++;

					String typeKey = propListEnt.getKey();
					List<Map<String, JsonOffsetElement>> childObjMapList = propListEnt.getValue();
					List<Map<String, String>> childJsonLdMapList = propJsonLdMap.get(typeKey);

					if(depth > 0) {
						sb.append("\"");
						sb.append(propListEnt.getKey());
						if(childObjMapList.size() > 1) {
							sb.append("List");
						}
						sb.append("\":");

						if(childObjMapList.size() > 1) {
							sb.append("[");
						}
					}

					int ec = 0;
					for(Map<String, JsonOffsetElement> childObjMap : childObjMapList) {
						Map<String, String> childJsonLdMap = childJsonLdMapList.get(ec);
						ec++;
						sb.append("{");

						int cc = 0;
						for(Map.Entry<String, JsonOffsetElement> childObjEnt : childObjMap.entrySet()) {
							cc++;
							String key = childObjEnt.getKey();
							JsonOffsetElement child = childObjEnt.getValue();

							sb.append("\"");
							sb.append(key);
							sb.append("\":");
							if(childJsonLdMap.containsKey(key)) {
								sb.append(childJsonLdMap.get(key));
							} else {
								jsonLdToJsonSub(jsonLd, child, jsonLdRootMap, key,
										thingStrModeMap, atIdMode, depth + 1, sb);
							}

							if(cc < childObjMap.size()) {
								sb.append(",");
							}
						}

						sb.append("}");
						if(ec < childObjMapList.size()) {
							sb.append(",");
						}
					}

					if(depth > 0 && childObjMapList.size() > 1) {
						sb.append("]");
					}

					if(pc < propListMap.size()) {
						sb.append(",");
					}
				}

				if(depth > 0) {
					sb.append("}");
				}
			}
		}
	}

	protected static boolean addJsonLdPropertyToJsonMap(String jsonLd,
			JsonOffsetElement joe, Map<String, String> jsonLdRootMap,
			Map<String, JsonLdThingStringGiven> thingStringModeMap,
			JsonLdAtIdStringGiven atIdMode, int depth,
			Map<String, List<Map<String, JsonOffsetElement>>> propListMap,
			Map<String, List<Map<String, String>>> propJsonLdMap) {
		Map<String, JsonOffsetElement> childObjMap = new HashMap<>();
		Map<String, String> childJsonLdMap = new HashMap<>();
		boolean keyIsId = false;
		boolean keyIsType = false;
		boolean keyIsJsonLd = false;
		String key = null;
		String idStr = null;
		String typeKey = null;
		for(JsonOffsetElement child : joe.children) {
			if(keyIsId) {
				if(child.type == JsonElementType.V_STRING
						&& child.objectPhase == JsonObjectPhase.VALUE) {
					String val = jsonLd.substring(child.start + 1, child.end);
					if(depth <= 1) {
						jsonLdRootMap.put(key, val);
					}
					JsonLdAtIdStringGiven mode = atIdMode;
					if(atIdMode == JsonLdAtIdStringGiven.AS_AUTO) {
						if(val.startsWith("http")) {
							mode = JsonLdAtIdStringGiven.AS_URL;
						} else {
							mode = JsonLdAtIdStringGiven.AS_TEXT;
						}
					}

					switch(mode) {
					case AS_URL:
						idStr = "{\"url\":\""
							+ SimpleJsonBuilder.escapeJson(val) + "\"}";
						break;
					case AS_TEXT:
					default:
						idStr = "{\"text\":\""
							+ SimpleJsonBuilder.escapeJson(val) + "\"}";
						break;
					}
					childObjMap.put("identifier", null);
					childJsonLdMap.put("identifier", idStr);
				} else if(child.type == JsonElementType.COMMA) {
					keyIsId = false;
				}
				continue;
			} else if(keyIsType) {
				if(child.type == JsonElementType.V_STRING
						&& child.objectPhase == JsonObjectPhase.VALUE) {
					String val = jsonLd.substring(child.start + 1, child.end);
					typeKey = Introspector.decapitalize(val);
					if(depth <= 1) {
						jsonLdRootMap.put(key, val);
					}
				} else if(child.type == JsonElementType.COMMA) {
					keyIsType = false;
				}
				continue;
			} else if(keyIsJsonLd) {
				if(depth <= 1) {
					if(child.type == JsonElementType.V_STRING
							&& child.objectPhase == JsonObjectPhase.VALUE) {
						String val = jsonLd.substring(child.start + 1, child.end);
						jsonLdRootMap.put(key, val);
					}
				}
				if(child.type == JsonElementType.COMMA) {
					keyIsJsonLd = false;
				}
				continue;
			} else {
				if(child.type == JsonElementType.V_STRING
						&& child.objectPhase == JsonObjectPhase.KEY) {
					key = jsonLd.substring(child.start + 1, child.end);
					// System.out.println(key + ": " + depth);
					if(key.equals("@id")) {
						keyIsId = true;
						continue;
					} else if(key.equals("@type")) {
						keyIsType = true;
						continue;
					} else if(key.startsWith("@")) {
						keyIsJsonLd = true;
						continue;
					}
				} else if(child.objectPhase == JsonObjectPhase.VALUE) {
					childObjMap.put(key, child);
				}
			}
		}

		if(typeKey == null) {
			// JSON-Ldと通常のJSONの混在はないはず
			return false;
		} else {
			List<Map<String, JsonOffsetElement>> childObjMapList = null;
			if(propListMap.containsKey(typeKey)) {
				childObjMapList = propListMap.get(typeKey);
			} else {
				childObjMapList = new ArrayList<>();
				propListMap.put(typeKey, childObjMapList);
			}
			childObjMapList.add(childObjMap);

			List<Map<String, String>> childJsonLdMapList = null;
			if(propJsonLdMap.containsKey(typeKey)) {
				childJsonLdMapList = propJsonLdMap.get(typeKey);
			} else {
				childJsonLdMapList = new ArrayList<>();
				propJsonLdMap.put(typeKey, childJsonLdMapList);
			}
			childJsonLdMapList.add(childJsonLdMap);

			return true;
		}
	}

}
