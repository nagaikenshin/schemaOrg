package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.COMPLETE_DATA_FEED;
import org.kyojo.schemaorg.m3n5.pending.Clazz.CompleteDataFeed;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CompleteDataFeedDeserializer implements JsonDeserializer<CompleteDataFeed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CompleteDataFeed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMPLETE_DATA_FEED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMPLETE_DATA_FEED(), CompleteDataFeed.class, COMPLETE_DATA_FEED.class, fldMap);
	}

}
