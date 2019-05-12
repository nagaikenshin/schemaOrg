package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.LEGAL_FORCE_STATUS;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegalForceStatus;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LegalForceStatusDeserializer implements JsonDeserializer<LegalForceStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegalForceStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEGAL_FORCE_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGAL_FORCE_STATUS(), LegalForceStatus.class, LEGAL_FORCE_STATUS.class, fldMap);
	}

}
