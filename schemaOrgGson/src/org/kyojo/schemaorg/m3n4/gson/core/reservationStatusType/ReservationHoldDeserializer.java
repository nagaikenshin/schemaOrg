package org.kyojo.schemaorg.m3n4.gson.core.reservationStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.reservationStatusType.RESERVATION_HOLD;
import org.kyojo.schemaorg.m3n4.core.ReservationStatusType.ReservationHold;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ReservationHoldDeserializer implements JsonDeserializer<ReservationHold> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReservationHold deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESERVATION_HOLD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESERVATION_HOLD(), ReservationHold.class, RESERVATION_HOLD.class, fldMap);
	}

}
