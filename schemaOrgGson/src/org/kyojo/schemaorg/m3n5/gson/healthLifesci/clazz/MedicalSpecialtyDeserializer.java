package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_SPECIALTY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalSpecialty;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MedicalSpecialtyDeserializer implements JsonDeserializer<MedicalSpecialty> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalSpecialty deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_SPECIALTY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_SPECIALTY(), MedicalSpecialty.class, MEDICAL_SPECIALTY.class, fldMap);
	}

}
