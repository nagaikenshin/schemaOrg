package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.RESERVATION_STATUS_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReservationStatusType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ReservationStatusTypeDeserializer implements JsonDeserializer<ReservationStatusType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReservationStatusType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESERVATION_STATUS_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESERVATION_STATUS_TYPE(), ReservationStatusType.class, RESERVATION_STATUS_TYPE.class, fldMap);
	}

}
