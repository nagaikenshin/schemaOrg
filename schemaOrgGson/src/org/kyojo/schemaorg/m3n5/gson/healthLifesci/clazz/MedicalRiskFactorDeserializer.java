package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_RISK_FACTOR;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalRiskFactor;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MedicalRiskFactorDeserializer implements JsonDeserializer<MedicalRiskFactor> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalRiskFactor deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_RISK_FACTOR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_RISK_FACTOR(), MedicalRiskFactor.class, MEDICAL_RISK_FACTOR.class, fldMap);
	}

}
