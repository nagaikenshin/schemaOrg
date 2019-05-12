package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.EMERGENCY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Emergency;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EmergencyDeserializer implements JsonDeserializer<Emergency> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Emergency deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EMERGENCY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EMERGENCY(), Emergency.class, EMERGENCY.class, fldMap);
	}

}
