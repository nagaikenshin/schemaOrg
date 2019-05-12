package org.kyojo.schemaorg.m3n5.gson.pending.legalValueLevel;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.legalValueLevel.UNOFFICIAL_LEGAL_VALUE;
import org.kyojo.schemaorg.m3n5.pending.LegalValueLevel.UnofficialLegalValue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class UnofficialLegalValueDeserializer implements JsonDeserializer<UnofficialLegalValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UnofficialLegalValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new UNOFFICIAL_LEGAL_VALUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new UNOFFICIAL_LEGAL_VALUE(), UnofficialLegalValue.class, UNOFFICIAL_LEGAL_VALUE.class, fldMap);
	}

}
