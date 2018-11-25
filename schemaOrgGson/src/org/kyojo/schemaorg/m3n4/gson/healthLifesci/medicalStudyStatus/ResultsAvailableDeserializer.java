package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalStudyStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalStudyStatus.RESULTS_AVAILABLE;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalStudyStatus.ResultsAvailable;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ResultsAvailableDeserializer implements JsonDeserializer<ResultsAvailable> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ResultsAvailable deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESULTS_AVAILABLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESULTS_AVAILABLE(), ResultsAvailable.class, RESULTS_AVAILABLE.class, fldMap);
	}

}
