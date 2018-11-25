package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalObservationalStudyDesign;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalObservationalStudyDesign.CASE_SERIES;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalObservationalStudyDesign.CaseSeries;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CaseSeriesDeserializer implements JsonDeserializer<CaseSeries> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CaseSeries deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CASE_SERIES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CASE_SERIES(), CaseSeries.class, CASE_SERIES.class, fldMap);
	}

}
