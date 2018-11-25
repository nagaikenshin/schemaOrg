package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.WORST_RATING;
import org.kyojo.schemaorg.m3n4.core.Container.WorstRating;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class WorstRatingDeserializer implements JsonDeserializer<WorstRating> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WorstRating deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WORST_RATING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WORST_RATING(), WorstRating.class, WORST_RATING.class, fldMap);
	}

}
