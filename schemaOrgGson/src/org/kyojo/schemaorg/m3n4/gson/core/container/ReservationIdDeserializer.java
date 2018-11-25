package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.RESERVATION_ID;
import org.kyojo.schemaorg.m3n4.core.Container.ReservationId;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ReservationIdDeserializer implements JsonDeserializer<ReservationId> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReservationId deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESERVATION_ID(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESERVATION_ID(), ReservationId.class, RESERVATION_ID.class, fldMap);
	}

}
