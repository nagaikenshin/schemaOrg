package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DRIVE_WHEEL_CONFIGURATION_VALUE;
import org.kyojo.schemaorg.m3n5.core.Clazz.DriveWheelConfigurationValue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DriveWheelConfigurationValueDeserializer implements JsonDeserializer<DriveWheelConfigurationValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DriveWheelConfigurationValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DRIVE_WHEEL_CONFIGURATION_VALUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DRIVE_WHEEL_CONFIGURATION_VALUE(), DriveWheelConfigurationValue.class, DRIVE_WHEEL_CONFIGURATION_VALUE.class, fldMap);
	}

}
