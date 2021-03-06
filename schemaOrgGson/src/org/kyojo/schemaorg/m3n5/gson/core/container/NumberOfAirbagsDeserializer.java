package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.NUMBER_OF_AIRBAGS;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfAirbags;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NumberOfAirbagsDeserializer implements JsonDeserializer<NumberOfAirbags> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfAirbags deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NUMBER_OF_AIRBAGS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_AIRBAGS(), NumberOfAirbags.class, NUMBER_OF_AIRBAGS.class, fldMap);
	}

}
