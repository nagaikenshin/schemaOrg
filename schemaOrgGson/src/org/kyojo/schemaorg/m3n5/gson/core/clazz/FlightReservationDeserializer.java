package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FLIGHT_RESERVATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.FlightReservation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FlightReservationDeserializer implements JsonDeserializer<FlightReservation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FlightReservation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FLIGHT_RESERVATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FLIGHT_RESERVATION(), FlightReservation.class, FLIGHT_RESERVATION.class, fldMap);
	}

}