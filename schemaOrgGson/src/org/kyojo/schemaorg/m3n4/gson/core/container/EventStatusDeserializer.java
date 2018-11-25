package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.EVENT_STATUS;
import org.kyojo.schemaorg.m3n4.core.Container.EventStatus;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EventStatusDeserializer implements JsonDeserializer<EventStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EventStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EVENT_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EVENT_STATUS(), EventStatus.class, EVENT_STATUS.class, fldMap);
	}

}
