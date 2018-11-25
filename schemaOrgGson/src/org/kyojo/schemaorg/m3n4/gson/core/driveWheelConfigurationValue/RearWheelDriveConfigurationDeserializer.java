package org.kyojo.schemaorg.m3n4.gson.core.driveWheelConfigurationValue;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.driveWheelConfigurationValue.REAR_WHEEL_DRIVE_CONFIGURATION;
import org.kyojo.schemaorg.m3n4.core.DriveWheelConfigurationValue.RearWheelDriveConfiguration;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RearWheelDriveConfigurationDeserializer implements JsonDeserializer<RearWheelDriveConfiguration> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RearWheelDriveConfiguration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REAR_WHEEL_DRIVE_CONFIGURATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REAR_WHEEL_DRIVE_CONFIGURATION(), RearWheelDriveConfiguration.class, REAR_WHEEL_DRIVE_CONFIGURATION.class, fldMap);
	}

}
