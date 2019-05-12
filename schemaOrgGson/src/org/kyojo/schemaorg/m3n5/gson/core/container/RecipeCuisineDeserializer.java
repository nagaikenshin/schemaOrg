package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RECIPE_CUISINE;
import org.kyojo.schemaorg.m3n5.core.Container.RecipeCuisine;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RecipeCuisineDeserializer implements JsonDeserializer<RecipeCuisine> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecipeCuisine deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECIPE_CUISINE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECIPE_CUISINE(), RecipeCuisine.class, RECIPE_CUISINE.class, fldMap);
	}

}
