package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalObservationalStudyDesign;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalObservationalStudyDesign.COHORT_STUDY;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalObservationalStudyDesign.CohortStudy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CohortStudyDeserializer implements JsonDeserializer<CohortStudy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CohortStudy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COHORT_STUDY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COHORT_STUDY(), CohortStudy.class, COHORT_STUDY.class, fldMap);
	}

}
