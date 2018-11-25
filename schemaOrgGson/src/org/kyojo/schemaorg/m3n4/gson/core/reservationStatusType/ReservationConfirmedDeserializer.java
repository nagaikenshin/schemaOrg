package org.kyojo.schemaorg.m3n4.gson.core.reservationStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.reservationStatusType.RESERVATION_CONFIRMED;
import org.kyojo.schemaorg.m3n4.core.ReservationStatusType.ReservationConfirmed;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ReservationConfirmedDeserializer implements JsonDeserializer<ReservationConfirmed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReservationConfirmed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESERVATION_CONFIRMED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESERVATION_CONFIRMED(), ReservationConfirmed.class, RESERVATION_CONFIRMED.class, fldMap);
	}

}
