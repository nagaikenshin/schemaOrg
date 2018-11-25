package org.kyojo.schemaorg.m3n4.gson.pending.legalValueLevel;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.legalValueLevel.AUTHORITATIVE_LEGAL_VALUE;
import org.kyojo.schemaorg.m3n4.pending.LegalValueLevel.AuthoritativeLegalValue;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AuthoritativeLegalValueDeserializer implements JsonDeserializer<AuthoritativeLegalValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AuthoritativeLegalValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AUTHORITATIVE_LEGAL_VALUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AUTHORITATIVE_LEGAL_VALUE(), AuthoritativeLegalValue.class, AUTHORITATIVE_LEGAL_VALUE.class, fldMap);
	}

}
