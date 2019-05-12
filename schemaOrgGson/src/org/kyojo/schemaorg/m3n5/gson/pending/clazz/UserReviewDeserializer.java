package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.USER_REVIEW;
import org.kyojo.schemaorg.m3n5.pending.Clazz.UserReview;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class UserReviewDeserializer implements JsonDeserializer<UserReview> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UserReview deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new USER_REVIEW(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new USER_REVIEW(), UserReview.class, USER_REVIEW.class, fldMap);
	}

}
