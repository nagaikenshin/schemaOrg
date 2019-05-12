package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BEST_RATING;
import org.kyojo.schemaorg.m3n5.core.Container.BestRating;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BestRatingDeserializer implements JsonDeserializer<BestRating> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BestRating deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BEST_RATING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BEST_RATING(), BestRating.class, BEST_RATING.class, fldMap);
	}

}
