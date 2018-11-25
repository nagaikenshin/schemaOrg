package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.EVENT_SCHEDULE;
import org.kyojo.schemaorg.m3n4.pending.Container.EventSchedule;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EventScheduleDeserializer implements JsonDeserializer<EventSchedule> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EventSchedule deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EVENT_SCHEDULE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EVENT_SCHEDULE(), EventSchedule.class, EVENT_SCHEDULE.class, fldMap);
	}

}
