package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.CORRECTIONS_POLICY;
import org.kyojo.schemaorg.m3n5.pending.Container.CorrectionsPolicy;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CorrectionsPolicyDeserializer implements JsonDeserializer<CorrectionsPolicy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CorrectionsPolicy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CORRECTIONS_POLICY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CORRECTIONS_POLICY(), CorrectionsPolicy.class, CORRECTIONS_POLICY.class, fldMap);
	}

}
