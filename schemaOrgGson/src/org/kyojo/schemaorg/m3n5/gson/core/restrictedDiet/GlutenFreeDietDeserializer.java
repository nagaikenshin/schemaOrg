package org.kyojo.schemaorg.m3n5.gson.core.restrictedDiet;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.restrictedDiet.GLUTEN_FREE_DIET;
import org.kyojo.schemaorg.m3n5.core.RestrictedDiet.GlutenFreeDiet;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GlutenFreeDietDeserializer implements JsonDeserializer<GlutenFreeDiet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GlutenFreeDiet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GLUTEN_FREE_DIET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GLUTEN_FREE_DIET(), GlutenFreeDiet.class, GLUTEN_FREE_DIET.class, fldMap);
	}

}
