package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.EVENT_SERIES;
import org.kyojo.schemaorg.m3n5.pending.Clazz.EventSeries;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EventSeriesDeserializer implements JsonDeserializer<EventSeries> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EventSeries deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EVENT_SERIES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EVENT_SERIES(), EventSeries.class, EVENT_SERIES.class, fldMap);
	}

}