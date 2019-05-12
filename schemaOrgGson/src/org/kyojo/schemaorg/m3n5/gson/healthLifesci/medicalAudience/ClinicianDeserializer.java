package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalAudience;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalAudience.CLINICIAN;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalAudience.Clinician;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ClinicianDeserializer implements JsonDeserializer<Clinician> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Clinician deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CLINICIAN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CLINICIAN(), Clinician.class, CLINICIAN.class, fldMap);
	}

}