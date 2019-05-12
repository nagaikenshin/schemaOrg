package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LEGAL_SERVICE;
import org.kyojo.schemaorg.m3n5.core.Clazz.LegalService;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LegalServiceDeserializer implements JsonDeserializer<LegalService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegalService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEGAL_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGAL_SERVICE(), LegalService.class, LEGAL_SERVICE.class, fldMap);
	}

}
