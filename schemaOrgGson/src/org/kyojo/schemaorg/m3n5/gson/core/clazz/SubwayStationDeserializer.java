package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SUBWAY_STATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.SubwayStation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SubwayStationDeserializer implements JsonDeserializer<SubwayStation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SubwayStation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUBWAY_STATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUBWAY_STATION(), SubwayStation.class, SUBWAY_STATION.class, fldMap);
	}

}
