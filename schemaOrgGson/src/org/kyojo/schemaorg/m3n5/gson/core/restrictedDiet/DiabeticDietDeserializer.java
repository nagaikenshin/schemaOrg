package org.kyojo.schemaorg.m3n5.gson.core.restrictedDiet;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.restrictedDiet.DIABETIC_DIET;
import org.kyojo.schemaorg.m3n5.core.RestrictedDiet.DiabeticDiet;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DiabeticDietDeserializer implements JsonDeserializer<DiabeticDiet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DiabeticDiet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIABETIC_DIET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIABETIC_DIET(), DiabeticDiet.class, DIABETIC_DIET.class, fldMap);
	}

}
