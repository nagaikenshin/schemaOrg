package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalTrialDesign;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalTrialDesign.SINGLE_CENTER_TRIAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalTrialDesign.SingleCenterTrial;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SingleCenterTrialDeserializer implements JsonDeserializer<SingleCenterTrial> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SingleCenterTrial deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SINGLE_CENTER_TRIAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SINGLE_CENTER_TRIAL(), SingleCenterTrial.class, SINGLE_CENTER_TRIAL.class, fldMap);
	}

}
