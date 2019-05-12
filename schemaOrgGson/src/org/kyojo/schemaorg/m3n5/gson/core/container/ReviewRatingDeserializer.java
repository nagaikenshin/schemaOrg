package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.REVIEW_RATING;
import org.kyojo.schemaorg.m3n5.core.Container.ReviewRating;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReviewRatingDeserializer implements JsonDeserializer<ReviewRating> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReviewRating deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REVIEW_RATING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REVIEW_RATING(), ReviewRating.class, REVIEW_RATING.class, fldMap);
	}

}
