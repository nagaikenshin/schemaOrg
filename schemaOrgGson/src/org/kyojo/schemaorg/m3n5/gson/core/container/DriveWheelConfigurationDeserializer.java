package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DRIVE_WHEEL_CONFIGURATION;
import org.kyojo.schemaorg.m3n5.core.Container.DriveWheelConfiguration;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DriveWheelConfigurationDeserializer implements JsonDeserializer<DriveWheelConfiguration> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DriveWheelConfiguration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DRIVE_WHEEL_CONFIGURATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DRIVE_WHEEL_CONFIGURATION(), DriveWheelConfiguration.class, DRIVE_WHEEL_CONFIGURATION.class, fldMap);
	}

}
