package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.AVAILABILITY_STARTS;
import org.kyojo.schemaorg.m3n4.pending.Container.AvailabilityStarts;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AvailabilityStartsDeserializer implements JsonDeserializer<AvailabilityStarts> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AvailabilityStarts deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new AVAILABILITY_STARTS(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AVAILABILITY_STARTS(), AvailabilityStarts.class, AVAILABILITY_STARTS.class, fldMap);
	}

}
