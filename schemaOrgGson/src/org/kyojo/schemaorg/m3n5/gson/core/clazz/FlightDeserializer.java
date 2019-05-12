package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FLIGHT;
import org.kyojo.schemaorg.m3n5.core.Clazz.Flight;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FlightDeserializer implements JsonDeserializer<Flight> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Flight deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FLIGHT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FLIGHT(), Flight.class, FLIGHT.class, fldMap);
	}

}
