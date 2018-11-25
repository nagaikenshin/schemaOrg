package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_SIGN_OR_SYMPTOM;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSignOrSymptom;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MedicalSignOrSymptomDeserializer implements JsonDeserializer<MedicalSignOrSymptom> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalSignOrSymptom deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_SIGN_OR_SYMPTOM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_SIGN_OR_SYMPTOM(), MedicalSignOrSymptom.class, MEDICAL_SIGN_OR_SYMPTOM.class, fldMap);
	}

}
