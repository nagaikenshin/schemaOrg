package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PASSENGER_PRIORITY_STATUS;
import org.kyojo.schemaorg.m3n5.core.Container.PassengerPriorityStatus;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PassengerPriorityStatusDeserializer implements JsonDeserializer<PassengerPriorityStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PassengerPriorityStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PASSENGER_PRIORITY_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PASSENGER_PRIORITY_STATUS(), PassengerPriorityStatus.class, PASSENGER_PRIORITY_STATUS.class, fldMap);
	}

}