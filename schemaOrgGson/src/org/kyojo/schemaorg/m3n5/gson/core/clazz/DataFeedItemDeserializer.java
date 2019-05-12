package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DATA_FEED_ITEM;
import org.kyojo.schemaorg.m3n5.core.Clazz.DataFeedItem;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DataFeedItemDeserializer implements JsonDeserializer<DataFeedItem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DataFeedItem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DATA_FEED_ITEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DATA_FEED_ITEM(), DataFeedItem.class, DATA_FEED_ITEM.class, fldMap);
	}

}
