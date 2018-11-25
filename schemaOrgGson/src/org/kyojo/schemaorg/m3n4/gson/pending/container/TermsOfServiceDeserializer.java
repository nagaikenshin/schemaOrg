package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.TERMS_OF_SERVICE;
import org.kyojo.schemaorg.m3n4.pending.Container.TermsOfService;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TermsOfServiceDeserializer implements JsonDeserializer<TermsOfService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TermsOfService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TERMS_OF_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TERMS_OF_SERVICE(), TermsOfService.class, TERMS_OF_SERVICE.class, fldMap);
	}

}
