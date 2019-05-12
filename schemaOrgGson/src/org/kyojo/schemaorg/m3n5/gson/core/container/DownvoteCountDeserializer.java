package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DOWNVOTE_COUNT;
import org.kyojo.schemaorg.m3n5.core.Container.DownvoteCount;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DownvoteCountDeserializer implements JsonDeserializer<DownvoteCount> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DownvoteCount deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new DOWNVOTE_COUNT(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DOWNVOTE_COUNT(), DownvoteCount.class, DOWNVOTE_COUNT.class, fldMap);
	}

}
