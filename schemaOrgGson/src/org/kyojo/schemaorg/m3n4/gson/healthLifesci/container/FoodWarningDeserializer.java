package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.FOOD_WARNING;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.FoodWarning;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FoodWarningDeserializer implements JsonDeserializer<FoodWarning> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FoodWarning deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FOOD_WARNING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FOOD_WARNING(), FoodWarning.class, FOOD_WARNING.class, fldMap);
	}

}
