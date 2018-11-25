package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_RISK_ESTIMATOR;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalRiskEstimator;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MedicalRiskEstimatorDeserializer implements JsonDeserializer<MedicalRiskEstimator> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalRiskEstimator deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_RISK_ESTIMATOR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_RISK_ESTIMATOR(), MedicalRiskEstimator.class, MEDICAL_RISK_ESTIMATOR.class, fldMap);
	}

}
