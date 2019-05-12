package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.EMPLOYER_REVIEW;
import org.kyojo.schemaorg.m3n5.pending.Clazz.EmployerReview;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EmployerReviewDeserializer implements JsonDeserializer<EmployerReview> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EmployerReview deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EMPLOYER_REVIEW(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EMPLOYER_REVIEW(), EmployerReview.class, EMPLOYER_REVIEW.class, fldMap);
	}

}
