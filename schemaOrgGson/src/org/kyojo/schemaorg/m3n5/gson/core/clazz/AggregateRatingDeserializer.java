package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.AGGREGATE_RATING;
import org.kyojo.schemaorg.m3n5.core.Clazz.AggregateRating;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AggregateRatingDeserializer implements JsonDeserializer<AggregateRating> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AggregateRating deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AGGREGATE_RATING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AGGREGATE_RATING(), AggregateRating.class, AGGREGATE_RATING.class, fldMap);
	}

}
