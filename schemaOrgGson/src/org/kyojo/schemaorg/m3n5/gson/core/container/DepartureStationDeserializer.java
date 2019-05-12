package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DEPARTURE_STATION;
import org.kyojo.schemaorg.m3n5.core.Container.DepartureStation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DepartureStationDeserializer implements JsonDeserializer<DepartureStation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DepartureStation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DEPARTURE_STATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DEPARTURE_STATION(), DepartureStation.class, DEPARTURE_STATION.class, fldMap);
	}

}
