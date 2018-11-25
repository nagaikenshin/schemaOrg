package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.RESULT_REVIEW;
import org.kyojo.schemaorg.m3n4.core.Container.ResultReview;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ResultReviewDeserializer implements JsonDeserializer<ResultReview> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ResultReview deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESULT_REVIEW(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESULT_REVIEW(), ResultReview.class, RESULT_REVIEW.class, fldMap);
	}

}
