package org.kyojo.schemaorg.m3n5.gson.pending.legalValueLevel;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.legalValueLevel.OFFICIAL_LEGAL_VALUE;
import org.kyojo.schemaorg.m3n5.pending.LegalValueLevel.OfficialLegalValue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OfficialLegalValueDeserializer implements JsonDeserializer<OfficialLegalValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OfficialLegalValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OFFICIAL_LEGAL_VALUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OFFICIAL_LEGAL_VALUE(), OfficialLegalValue.class, OFFICIAL_LEGAL_VALUE.class, fldMap);
	}

}
