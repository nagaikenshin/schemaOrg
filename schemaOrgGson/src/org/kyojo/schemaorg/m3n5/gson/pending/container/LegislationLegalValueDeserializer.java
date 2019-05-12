package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.LEGISLATION_LEGAL_VALUE;
import org.kyojo.schemaorg.m3n5.pending.Container.LegislationLegalValue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LegislationLegalValueDeserializer implements JsonDeserializer<LegislationLegalValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegislationLegalValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEGISLATION_LEGAL_VALUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGISLATION_LEGAL_VALUE(), LegislationLegalValue.class, LEGISLATION_LEGAL_VALUE.class, fldMap);
	}

}
