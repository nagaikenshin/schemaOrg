package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.EVIDENCE_LEVEL;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.EvidenceLevel;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EvidenceLevelDeserializer implements JsonDeserializer<EvidenceLevel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EvidenceLevel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EVIDENCE_LEVEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EVIDENCE_LEVEL(), EvidenceLevel.class, EVIDENCE_LEVEL.class, fldMap);
	}

}
