package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ARRIVAL_AIRPORT;
import org.kyojo.schemaorg.m3n5.core.Container.ArrivalAirport;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ArrivalAirportDeserializer implements JsonDeserializer<ArrivalAirport> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArrivalAirport deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ARRIVAL_AIRPORT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARRIVAL_AIRPORT(), ArrivalAirport.class, ARRIVAL_AIRPORT.class, fldMap);
	}

}
