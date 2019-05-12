package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TICKETED_SEAT;
import org.kyojo.schemaorg.m3n5.core.Container.TicketedSeat;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TicketedSeatDeserializer implements JsonDeserializer<TicketedSeat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TicketedSeat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TICKETED_SEAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TICKETED_SEAT(), TicketedSeat.class, TICKETED_SEAT.class, fldMap);
	}

}
