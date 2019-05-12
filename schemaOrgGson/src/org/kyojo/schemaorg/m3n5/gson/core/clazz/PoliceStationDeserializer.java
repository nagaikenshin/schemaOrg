package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.POLICE_STATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.PoliceStation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PoliceStationDeserializer implements JsonDeserializer<PoliceStation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PoliceStation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new POLICE_STATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new POLICE_STATION(), PoliceStation.class, POLICE_STATION.class, fldMap);
	}

}
