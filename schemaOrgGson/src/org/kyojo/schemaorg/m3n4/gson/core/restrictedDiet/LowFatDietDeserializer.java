package org.kyojo.schemaorg.m3n4.gson.core.restrictedDiet;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.restrictedDiet.LOW_FAT_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.LowFatDiet;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LowFatDietDeserializer implements JsonDeserializer<LowFatDiet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LowFatDiet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LOW_FAT_DIET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LOW_FAT_DIET(), LowFatDiet.class, LOW_FAT_DIET.class, fldMap);
	}

}
