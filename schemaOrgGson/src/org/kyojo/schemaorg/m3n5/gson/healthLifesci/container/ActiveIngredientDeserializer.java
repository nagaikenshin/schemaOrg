package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.ACTIVE_INGREDIENT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.ActiveIngredient;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ActiveIngredientDeserializer implements JsonDeserializer<ActiveIngredient> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ActiveIngredient deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACTIVE_INGREDIENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACTIVE_INGREDIENT(), ActiveIngredient.class, ACTIVE_INGREDIENT.class, fldMap);
	}

}
