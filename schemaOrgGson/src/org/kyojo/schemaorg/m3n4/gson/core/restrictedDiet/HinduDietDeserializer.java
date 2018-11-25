package org.kyojo.schemaorg.m3n4.gson.core.restrictedDiet;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.restrictedDiet.HINDU_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.HinduDiet;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HinduDietDeserializer implements JsonDeserializer<HinduDiet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HinduDiet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HINDU_DIET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HINDU_DIET(), HinduDiet.class, HINDU_DIET.class, fldMap);
	}

}
