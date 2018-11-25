package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.VEHICLE_ENGINE;
import org.kyojo.schemaorg.m3n4.core.Container.VehicleEngine;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class VehicleEngineDeserializer implements JsonDeserializer<VehicleEngine> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VehicleEngine deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VEHICLE_ENGINE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VEHICLE_ENGINE(), VehicleEngine.class, VEHICLE_ENGINE.class, fldMap);
	}

}
