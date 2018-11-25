package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.FOOD_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodService;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FoodServiceDeserializer implements JsonDeserializer<FoodService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FoodService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FOOD_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FOOD_SERVICE(), FoodService.class, FOOD_SERVICE.class, fldMap);
	}

}
