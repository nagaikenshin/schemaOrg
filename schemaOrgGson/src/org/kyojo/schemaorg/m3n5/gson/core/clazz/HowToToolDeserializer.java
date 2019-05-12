package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HOW_TO_TOOL;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToTool;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HowToToolDeserializer implements JsonDeserializer<HowToTool> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HowToTool deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HOW_TO_TOOL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HOW_TO_TOOL(), HowToTool.class, HOW_TO_TOOL.class, fldMap);
	}

}
