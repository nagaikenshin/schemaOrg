package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalEvidenceLevel;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalEvidenceLevel.EVIDENCE_LEVEL_A;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalEvidenceLevel.EvidenceLevelA;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EvidenceLevelADeserializer implements JsonDeserializer<EvidenceLevelA> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EvidenceLevelA deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EVIDENCE_LEVEL_A(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EVIDENCE_LEVEL_A(), EvidenceLevelA.class, EVIDENCE_LEVEL_A.class, fldMap);
	}

}
