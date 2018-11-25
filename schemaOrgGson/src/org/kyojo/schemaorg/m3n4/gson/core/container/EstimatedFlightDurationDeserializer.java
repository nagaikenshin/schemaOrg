package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ESTIMATED_FLIGHT_DURATION;
import org.kyojo.schemaorg.m3n4.core.Container.EstimatedFlightDuration;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EstimatedFlightDurationDeserializer implements JsonDeserializer<EstimatedFlightDuration> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EstimatedFlightDuration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ESTIMATED_FLIGHT_DURATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ESTIMATED_FLIGHT_DURATION(), EstimatedFlightDuration.class, ESTIMATED_FLIGHT_DURATION.class, fldMap);
	}

}
