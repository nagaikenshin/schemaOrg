package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ARRIVAL_BUS_STOP;
import org.kyojo.schemaorg.m3n4.core.Container.ArrivalBusStop;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ArrivalBusStopDeserializer implements JsonDeserializer<ArrivalBusStop> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArrivalBusStop deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ARRIVAL_BUS_STOP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARRIVAL_BUS_STOP(), ArrivalBusStop.class, ARRIVAL_BUS_STOP.class, fldMap);
	}

}
