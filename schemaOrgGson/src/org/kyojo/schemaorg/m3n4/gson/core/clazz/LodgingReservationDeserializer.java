package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.LODGING_RESERVATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.LodgingReservation;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LodgingReservationDeserializer implements JsonDeserializer<LodgingReservation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LodgingReservation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LODGING_RESERVATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LODGING_RESERVATION(), LodgingReservation.class, LODGING_RESERVATION.class, fldMap);
	}

}
