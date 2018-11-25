package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.VEHICLE_CONFIGURATION;
import org.kyojo.schemaorg.m3n4.core.Container.VehicleConfiguration;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class VehicleConfigurationDeserializer implements JsonDeserializer<VehicleConfiguration> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VehicleConfiguration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VEHICLE_CONFIGURATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VEHICLE_CONFIGURATION(), VehicleConfiguration.class, VEHICLE_CONFIGURATION.class, fldMap);
	}

}
