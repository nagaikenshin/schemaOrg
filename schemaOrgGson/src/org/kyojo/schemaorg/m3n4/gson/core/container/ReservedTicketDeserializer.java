package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.RESERVED_TICKET;
import org.kyojo.schemaorg.m3n4.core.Container.ReservedTicket;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ReservedTicketDeserializer implements JsonDeserializer<ReservedTicket> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReservedTicket deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESERVED_TICKET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESERVED_TICKET(), ReservedTicket.class, RESERVED_TICKET.class, fldMap);
	}

}
