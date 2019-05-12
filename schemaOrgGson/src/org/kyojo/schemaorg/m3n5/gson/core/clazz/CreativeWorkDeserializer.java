package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CREATIVE_WORK;
import org.kyojo.schemaorg.m3n5.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CreativeWorkDeserializer implements JsonDeserializer<CreativeWork> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CreativeWork deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CREATIVE_WORK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CREATIVE_WORK(), CreativeWork.class, CREATIVE_WORK.class, fldMap);
	}

}
