package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HEALTH_AND_BEAUTY_BUSINESS;
import org.kyojo.schemaorg.m3n5.core.Clazz.HealthAndBeautyBusiness;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HealthAndBeautyBusinessDeserializer implements JsonDeserializer<HealthAndBeautyBusiness> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HealthAndBeautyBusiness deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEALTH_AND_BEAUTY_BUSINESS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEALTH_AND_BEAUTY_BUSINESS(), HealthAndBeautyBusiness.class, HEALTH_AND_BEAUTY_BUSINESS.class, fldMap);
	}

}
