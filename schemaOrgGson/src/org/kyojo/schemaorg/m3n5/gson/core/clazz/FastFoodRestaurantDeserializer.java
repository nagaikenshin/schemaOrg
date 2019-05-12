package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FAST_FOOD_RESTAURANT;
import org.kyojo.schemaorg.m3n5.core.Clazz.FastFoodRestaurant;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FastFoodRestaurantDeserializer implements JsonDeserializer<FastFoodRestaurant> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FastFoodRestaurant deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FAST_FOOD_RESTAURANT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FAST_FOOD_RESTAURANT(), FastFoodRestaurant.class, FAST_FOOD_RESTAURANT.class, fldMap);
	}

}
