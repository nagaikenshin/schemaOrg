package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.PHARMACY_SPECIALTY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.PharmacySpecialty;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PharmacySpecialtyDeserializer implements JsonDeserializer<PharmacySpecialty> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PharmacySpecialty deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PHARMACY_SPECIALTY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PHARMACY_SPECIALTY(), PharmacySpecialty.class, PHARMACY_SPECIALTY.class, fldMap);
	}

}
