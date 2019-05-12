package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.LEGAL_VALUE_LEVEL;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegalValueLevel;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LegalValueLevelDeserializer implements JsonDeserializer<LegalValueLevel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegalValueLevel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEGAL_VALUE_LEVEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGAL_VALUE_LEVEL(), LegalValueLevel.class, LEGAL_VALUE_LEVEL.class, fldMap);
	}

}
