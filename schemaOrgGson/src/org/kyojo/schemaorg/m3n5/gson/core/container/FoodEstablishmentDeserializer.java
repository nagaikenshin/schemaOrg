package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FOOD_ESTABLISHMENT;
import org.kyojo.schemaorg.m3n5.core.Container.FoodEstablishment;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FoodEstablishmentDeserializer implements JsonDeserializer<FoodEstablishment> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FoodEstablishment deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FOOD_ESTABLISHMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FOOD_ESTABLISHMENT(), FoodEstablishment.class, FOOD_ESTABLISHMENT.class, fldMap);
	}

}
