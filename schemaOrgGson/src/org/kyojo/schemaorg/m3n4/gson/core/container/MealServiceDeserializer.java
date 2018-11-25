package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MEAL_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Container.MealService;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MealServiceDeserializer implements JsonDeserializer<MealService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MealService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEAL_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEAL_SERVICE(), MealService.class, MEAL_SERVICE.class, fldMap);
	}

}
