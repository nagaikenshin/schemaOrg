package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CLAIM_REVIEWED;
import org.kyojo.schemaorg.m3n4.core.Container.ClaimReviewed;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ClaimReviewedDeserializer implements JsonDeserializer<ClaimReviewed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ClaimReviewed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CLAIM_REVIEWED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CLAIM_REVIEWED(), ClaimReviewed.class, CLAIM_REVIEWED.class, fldMap);
	}

}
