package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RATING_VALUE;
import org.kyojo.schemaorg.m3n5.core.Container.RatingValue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RatingValueDeserializer implements JsonDeserializer<RatingValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RatingValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RATING_VALUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RATING_VALUE(), RatingValue.class, RATING_VALUE.class, fldMap);
	}

}
