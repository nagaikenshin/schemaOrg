package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.CRITIC_REVIEW;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CriticReview;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CriticReviewDeserializer implements JsonDeserializer<CriticReview> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CriticReview deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CRITIC_REVIEW(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CRITIC_REVIEW(), CriticReview.class, CRITIC_REVIEW.class, fldMap);
	}

}