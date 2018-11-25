package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.SPEECH_PATHOLOGY;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.SpeechPathology;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SpeechPathologyDeserializer implements JsonDeserializer<SpeechPathology> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SpeechPathology deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPEECH_PATHOLOGY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPEECH_PATHOLOGY(), SpeechPathology.class, SPEECH_PATHOLOGY.class, fldMap);
	}

}
