package org.kyojo.schemaorg.m3n4.gson.core.eventStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.eventStatusType.EVENT_CANCELLED;
import org.kyojo.schemaorg.m3n4.core.EventStatusType.EventCancelled;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EventCancelledDeserializer implements JsonDeserializer<EventCancelled> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EventCancelled deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EVENT_CANCELLED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EVENT_CANCELLED(), EventCancelled.class, EVENT_CANCELLED.class, fldMap);
	}

}
