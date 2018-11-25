package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_SEASONS;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfSeasons;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NumberOfSeasonsDeserializer implements JsonDeserializer<NumberOfSeasons> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfSeasons deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new NUMBER_OF_SEASONS(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_SEASONS(), NumberOfSeasons.class, NUMBER_OF_SEASONS.class, fldMap);
	}

}
