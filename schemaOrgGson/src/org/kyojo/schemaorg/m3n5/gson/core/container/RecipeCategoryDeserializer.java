package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RECIPE_CATEGORY;
import org.kyojo.schemaorg.m3n5.core.Container.RecipeCategory;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RecipeCategoryDeserializer implements JsonDeserializer<RecipeCategory> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecipeCategory deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECIPE_CATEGORY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECIPE_CATEGORY(), RecipeCategory.class, RECIPE_CATEGORY.class, fldMap);
	}

}
