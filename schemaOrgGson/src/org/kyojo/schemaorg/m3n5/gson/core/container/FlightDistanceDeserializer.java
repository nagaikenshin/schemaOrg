package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FLIGHT_DISTANCE;
import org.kyojo.schemaorg.m3n5.core.Container.FlightDistance;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FlightDistanceDeserializer implements JsonDeserializer<FlightDistance> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FlightDistance deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FLIGHT_DISTANCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FLIGHT_DISTANCE(), FlightDistance.class, FLIGHT_DISTANCE.class, fldMap);
	}

}
