package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.DIET_NUTRITION;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.DietNutrition;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DietNutritionDeserializer implements JsonDeserializer<DietNutrition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DietNutrition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIET_NUTRITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIET_NUTRITION(), DietNutrition.class, DIET_NUTRITION.class, fldMap);
	}

}
