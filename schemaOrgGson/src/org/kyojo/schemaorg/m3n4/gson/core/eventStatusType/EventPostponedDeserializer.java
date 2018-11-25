package org.kyojo.schemaorg.m3n4.gson.core.eventStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.eventStatusType.EVENT_POSTPONED;
import org.kyojo.schemaorg.m3n4.core.EventStatusType.EventPostponed;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EventPostponedDeserializer implements JsonDeserializer<EventPostponed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EventPostponed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EVENT_POSTPONED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EVENT_POSTPONED(), EventPostponed.class, EVENT_POSTPONED.class, fldMap);
	}

}
