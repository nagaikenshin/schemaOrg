package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.EMPLOYER_AGGREGATE_RATING;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EmployerAggregateRating;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EmployerAggregateRatingDeserializer implements JsonDeserializer<EmployerAggregateRating> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EmployerAggregateRating deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EMPLOYER_AGGREGATE_RATING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EMPLOYER_AGGREGATE_RATING(), EmployerAggregateRating.class, EMPLOYER_AGGREGATE_RATING.class, fldMap);
	}

}
