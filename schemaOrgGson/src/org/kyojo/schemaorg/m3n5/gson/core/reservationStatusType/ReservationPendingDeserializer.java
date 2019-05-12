package org.kyojo.schemaorg.m3n5.gson.core.reservationStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.reservationStatusType.RESERVATION_PENDING;
import org.kyojo.schemaorg.m3n5.core.ReservationStatusType.ReservationPending;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReservationPendingDeserializer implements JsonDeserializer<ReservationPending> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReservationPending deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESERVATION_PENDING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESERVATION_PENDING(), ReservationPending.class, RESERVATION_PENDING.class, fldMap);
	}

}
