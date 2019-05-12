package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CONTENT_RATING;
import org.kyojo.schemaorg.m3n5.core.Container.ContentRating;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ContentRatingDeserializer implements JsonDeserializer<ContentRating> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ContentRating deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONTENT_RATING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTENT_RATING(), ContentRating.class, CONTENT_RATING.class, fldMap);
	}

}
