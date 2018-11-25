package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SUB_RESERVATION;
import org.kyojo.schemaorg.m3n4.core.Container.SubReservation;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SubReservationDeserializer implements JsonDeserializer<SubReservation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SubReservation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUB_RESERVATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUB_RESERVATION(), SubReservation.class, SUB_RESERVATION.class, fldMap);
	}

}
