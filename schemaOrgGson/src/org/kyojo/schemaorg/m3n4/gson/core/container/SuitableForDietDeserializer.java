package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SUITABLE_FOR_DIET;
import org.kyojo.schemaorg.m3n4.core.Container.SuitableForDiet;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SuitableForDietDeserializer implements JsonDeserializer<SuitableForDiet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SuitableForDiet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUITABLE_FOR_DIET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUITABLE_FOR_DIET(), SuitableForDiet.class, SUITABLE_FOR_DIET.class, fldMap);
	}

}
