package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_CLINIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalClinic;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MedicalClinicDeserializer implements JsonDeserializer<MedicalClinic> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalClinic deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_CLINIC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_CLINIC(), MedicalClinic.class, MEDICAL_CLINIC.class, fldMap);
	}

}
