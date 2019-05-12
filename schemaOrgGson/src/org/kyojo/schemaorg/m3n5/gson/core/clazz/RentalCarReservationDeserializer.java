package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RENTAL_CAR_RESERVATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.RentalCarReservation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RentalCarReservationDeserializer implements JsonDeserializer<RentalCarReservation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RentalCarReservation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RENTAL_CAR_RESERVATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RENTAL_CAR_RESERVATION(), RentalCarReservation.class, RENTAL_CAR_RESERVATION.class, fldMap);
	}

}
