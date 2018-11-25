package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.STAR_RATING;
import org.kyojo.schemaorg.m3n4.core.Container.StarRating;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class StarRatingDeserializer implements JsonDeserializer<StarRating> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StarRating deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STAR_RATING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STAR_RATING(), StarRating.class, STAR_RATING.class, fldMap);
	}

}
