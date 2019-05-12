package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LEGAL_NAME;
import org.kyojo.schemaorg.m3n5.core.Container.LegalName;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LegalNameDeserializer implements JsonDeserializer<LegalName> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegalName deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEGAL_NAME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGAL_NAME(), LegalName.class, LEGAL_NAME.class, fldMap);
	}

}