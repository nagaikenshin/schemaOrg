package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.ACRISS_CODE;
import org.kyojo.schemaorg.m3n5.auto.Container.AcrissCode;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AcrissCodeDeserializer implements JsonDeserializer<AcrissCode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AcrissCode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACRISS_CODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACRISS_CODE(), AcrissCode.class, ACRISS_CODE.class, fldMap);
	}

}
