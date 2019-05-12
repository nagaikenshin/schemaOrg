package org.kyojo.schemaorg.m3n5.gson.core.reservationStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.reservationStatusType.RESERVATION_CANCELLED;
import org.kyojo.schemaorg.m3n5.core.ReservationStatusType.ReservationCancelled;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReservationCancelledDeserializer implements JsonDeserializer<ReservationCancelled> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReservationCancelled deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESERVATION_CANCELLED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESERVATION_CANCELLED(), ReservationCancelled.class, RESERVATION_CANCELLED.class, fldMap);
	}

}
