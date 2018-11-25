package org.kyojo.schemaorg.m3n4.gson.core.restrictedDiet;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.restrictedDiet.VEGAN_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.VeganDiet;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class VeganDietDeserializer implements JsonDeserializer<VeganDiet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VeganDiet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VEGAN_DIET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VEGAN_DIET(), VeganDiet.class, VEGAN_DIET.class, fldMap);
	}

}
