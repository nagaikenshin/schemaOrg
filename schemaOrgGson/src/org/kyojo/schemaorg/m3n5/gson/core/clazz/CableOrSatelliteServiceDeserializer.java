package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CABLE_OR_SATELLITE_SERVICE;
import org.kyojo.schemaorg.m3n5.core.Clazz.CableOrSatelliteService;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CableOrSatelliteServiceDeserializer implements JsonDeserializer<CableOrSatelliteService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CableOrSatelliteService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CABLE_OR_SATELLITE_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CABLE_OR_SATELLITE_SERVICE(), CableOrSatelliteService.class, CABLE_OR_SATELLITE_SERVICE.class, fldMap);
	}

}
