package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ARRIVAL_STATION;
import org.kyojo.schemaorg.m3n4.core.Container.ArrivalStation;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ArrivalStationDeserializer implements JsonDeserializer<ArrivalStation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArrivalStation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ARRIVAL_STATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARRIVAL_STATION(), ArrivalStation.class, ARRIVAL_STATION.class, fldMap);
	}

}
