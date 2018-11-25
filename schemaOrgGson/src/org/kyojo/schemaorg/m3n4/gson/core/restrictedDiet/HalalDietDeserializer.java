package org.kyojo.schemaorg.m3n4.gson.core.restrictedDiet;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.restrictedDiet.HALAL_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.HalalDiet;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HalalDietDeserializer implements JsonDeserializer<HalalDiet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HalalDiet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HALAL_DIET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HALAL_DIET(), HalalDiet.class, HALAL_DIET.class, fldMap);
	}

}
