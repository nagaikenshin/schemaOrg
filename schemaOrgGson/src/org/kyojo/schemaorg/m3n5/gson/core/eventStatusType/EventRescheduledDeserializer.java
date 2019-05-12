package org.kyojo.schemaorg.m3n5.gson.core.eventStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.eventStatusType.EVENT_RESCHEDULED;
import org.kyojo.schemaorg.m3n5.core.EventStatusType.EventRescheduled;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EventRescheduledDeserializer implements JsonDeserializer<EventRescheduled> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EventRescheduled deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EVENT_RESCHEDULED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EVENT_RESCHEDULED(), EventRescheduled.class, EVENT_RESCHEDULED.class, fldMap);
	}

}
