package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RESERVATION_STATUS;
import org.kyojo.schemaorg.m3n5.core.Container.ReservationStatus;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReservationStatusDeserializer implements JsonDeserializer<ReservationStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReservationStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESERVATION_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESERVATION_STATUS(), ReservationStatus.class, RESERVATION_STATUS.class, fldMap);
	}

}
