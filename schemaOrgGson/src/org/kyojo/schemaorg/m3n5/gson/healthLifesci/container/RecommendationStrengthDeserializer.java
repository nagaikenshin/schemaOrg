package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.RECOMMENDATION_STRENGTH;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.RecommendationStrength;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RecommendationStrengthDeserializer implements JsonDeserializer<RecommendationStrength> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecommendationStrength deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECOMMENDATION_STRENGTH(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECOMMENDATION_STRENGTH(), RecommendationStrength.class, RECOMMENDATION_STRENGTH.class, fldMap);
	}

}
