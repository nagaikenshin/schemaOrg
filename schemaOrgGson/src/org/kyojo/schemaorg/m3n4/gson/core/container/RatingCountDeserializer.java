package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.RATING_COUNT;
import org.kyojo.schemaorg.m3n4.core.Container.RatingCount;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RatingCountDeserializer implements JsonDeserializer<RatingCount> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RatingCount deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new RATING_COUNT(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RATING_COUNT(), RatingCount.class, RATING_COUNT.class, fldMap);
	}

}
