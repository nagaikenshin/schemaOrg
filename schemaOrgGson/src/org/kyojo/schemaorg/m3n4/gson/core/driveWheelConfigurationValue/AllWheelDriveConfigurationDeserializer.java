package org.kyojo.schemaorg.m3n4.gson.core.driveWheelConfigurationValue;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.driveWheelConfigurationValue.ALL_WHEEL_DRIVE_CONFIGURATION;
import org.kyojo.schemaorg.m3n4.core.DriveWheelConfigurationValue.AllWheelDriveConfiguration;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AllWheelDriveConfigurationDeserializer implements JsonDeserializer<AllWheelDriveConfiguration> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AllWheelDriveConfiguration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ALL_WHEEL_DRIVE_CONFIGURATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ALL_WHEEL_DRIVE_CONFIGURATION(), AllWheelDriveConfiguration.class, ALL_WHEEL_DRIVE_CONFIGURATION.class, fldMap);
	}

}
