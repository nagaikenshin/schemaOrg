package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalTrialDesign;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalTrialDesign.INTERNATIONAL_TRIAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalTrialDesign.InternationalTrial;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class InternationalTrialDeserializer implements JsonDeserializer<InternationalTrial> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InternationalTrial deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INTERNATIONAL_TRIAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INTERNATIONAL_TRIAL(), InternationalTrial.class, INTERNATIONAL_TRIAL.class, fldMap);
	}

}
