package org.kyojo.schemaorg.m3n5.gson.core.restrictedDiet;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.restrictedDiet.VEGETARIAN_DIET;
import org.kyojo.schemaorg.m3n5.core.RestrictedDiet.VegetarianDiet;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VegetarianDietDeserializer implements JsonDeserializer<VegetarianDiet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VegetarianDiet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VEGETARIAN_DIET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VEGETARIAN_DIET(), VegetarianDiet.class, VEGETARIAN_DIET.class, fldMap);
	}

}
