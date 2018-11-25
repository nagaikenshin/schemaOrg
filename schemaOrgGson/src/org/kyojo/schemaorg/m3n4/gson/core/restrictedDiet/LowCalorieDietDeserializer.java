package org.kyojo.schemaorg.m3n4.gson.core.restrictedDiet;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.restrictedDiet.LOW_CALORIE_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.LowCalorieDiet;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LowCalorieDietDeserializer implements JsonDeserializer<LowCalorieDiet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LowCalorieDiet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LOW_CALORIE_DIET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LOW_CALORIE_DIET(), LowCalorieDiet.class, LOW_CALORIE_DIET.class, fldMap);
	}

}
