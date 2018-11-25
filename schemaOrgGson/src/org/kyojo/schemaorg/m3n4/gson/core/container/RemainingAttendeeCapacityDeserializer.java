package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.REMAINING_ATTENDEE_CAPACITY;
import org.kyojo.schemaorg.m3n4.core.Container.RemainingAttendeeCapacity;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RemainingAttendeeCapacityDeserializer implements JsonDeserializer<RemainingAttendeeCapacity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RemainingAttendeeCapacity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new REMAINING_ATTENDEE_CAPACITY(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REMAINING_ATTENDEE_CAPACITY(), RemainingAttendeeCapacity.class, REMAINING_ATTENDEE_CAPACITY.class, fldMap);
	}

}
