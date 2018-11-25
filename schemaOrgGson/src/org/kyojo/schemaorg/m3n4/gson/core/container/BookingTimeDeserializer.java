package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BOOKING_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.BookingTime;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BookingTimeDeserializer implements JsonDeserializer<BookingTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BookingTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new BOOKING_TIME(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BOOKING_TIME(), BookingTime.class, BOOKING_TIME.class, fldMap);
	}

}
