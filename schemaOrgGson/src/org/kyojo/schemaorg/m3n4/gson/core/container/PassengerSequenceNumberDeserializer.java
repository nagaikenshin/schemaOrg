package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PASSENGER_SEQUENCE_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.PassengerSequenceNumber;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PassengerSequenceNumberDeserializer implements JsonDeserializer<PassengerSequenceNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PassengerSequenceNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PASSENGER_SEQUENCE_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PASSENGER_SEQUENCE_NUMBER(), PassengerSequenceNumber.class, PASSENGER_SEQUENCE_NUMBER.class, fldMap);
	}

}
