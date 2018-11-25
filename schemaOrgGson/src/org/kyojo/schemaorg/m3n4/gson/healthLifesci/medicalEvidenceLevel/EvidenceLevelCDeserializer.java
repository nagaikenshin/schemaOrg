package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalEvidenceLevel;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalEvidenceLevel.EVIDENCE_LEVEL_C;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalEvidenceLevel.EvidenceLevelC;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EvidenceLevelCDeserializer implements JsonDeserializer<EvidenceLevelC> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EvidenceLevelC deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EVIDENCE_LEVEL_C(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EVIDENCE_LEVEL_C(), EvidenceLevelC.class, EVIDENCE_LEVEL_C.class, fldMap);
	}

}
