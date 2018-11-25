package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalTrialDesign;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalTrialDesign.TRIPLE_BLINDED_TRIAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalTrialDesign.TripleBlindedTrial;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TripleBlindedTrialDeserializer implements JsonDeserializer<TripleBlindedTrial> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TripleBlindedTrial deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRIPLE_BLINDED_TRIAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRIPLE_BLINDED_TRIAL(), TripleBlindedTrial.class, TRIPLE_BLINDED_TRIAL.class, fldMap);
	}

}
