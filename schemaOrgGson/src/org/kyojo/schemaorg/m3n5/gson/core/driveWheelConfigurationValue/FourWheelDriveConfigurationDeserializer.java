package org.kyojo.schemaorg.m3n5.gson.core.driveWheelConfigurationValue;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.driveWheelConfigurationValue.FOUR_WHEEL_DRIVE_CONFIGURATION;
import org.kyojo.schemaorg.m3n5.core.DriveWheelConfigurationValue.FourWheelDriveConfiguration;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FourWheelDriveConfigurationDeserializer implements JsonDeserializer<FourWheelDriveConfiguration> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FourWheelDriveConfiguration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FOUR_WHEEL_DRIVE_CONFIGURATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FOUR_WHEEL_DRIVE_CONFIGURATION(), FourWheelDriveConfiguration.class, FOUR_WHEEL_DRIVE_CONFIGURATION.class, fldMap);
	}

}
