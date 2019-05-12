package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalTrialDesign;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalTrialDesign.MULTI_CENTER_TRIAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalTrialDesign.MultiCenterTrial;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MultiCenterTrialDeserializer implements JsonDeserializer<MultiCenterTrial> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MultiCenterTrial deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MULTI_CENTER_TRIAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MULTI_CENTER_TRIAL(), MultiCenterTrial.class, MULTI_CENTER_TRIAL.class, fldMap);
	}

}
