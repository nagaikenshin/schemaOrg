package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EVENT_VENUE;
import org.kyojo.schemaorg.m3n5.core.Clazz.EventVenue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EventVenueDeserializer implements JsonDeserializer<EventVenue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EventVenue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EVENT_VENUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EVENT_VENUE(), EventVenue.class, EVENT_VENUE.class, fldMap);
	}

}
