package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ENCODES_CREATIVE_WORK;
import org.kyojo.schemaorg.m3n4.core.Container.EncodesCreativeWork;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EncodesCreativeWorkDeserializer implements JsonDeserializer<EncodesCreativeWork> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EncodesCreativeWork deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ENCODES_CREATIVE_WORK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ENCODES_CREATIVE_WORK(), EncodesCreativeWork.class, ENCODES_CREATIVE_WORK.class, fldMap);
	}

}
