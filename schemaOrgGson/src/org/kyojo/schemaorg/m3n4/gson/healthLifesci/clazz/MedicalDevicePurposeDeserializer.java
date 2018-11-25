package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_DEVICE_PURPOSE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalDevicePurpose;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MedicalDevicePurposeDeserializer implements JsonDeserializer<MedicalDevicePurpose> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalDevicePurpose deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_DEVICE_PURPOSE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_DEVICE_PURPOSE(), MedicalDevicePurpose.class, MEDICAL_DEVICE_PURPOSE.class, fldMap);
	}

}
