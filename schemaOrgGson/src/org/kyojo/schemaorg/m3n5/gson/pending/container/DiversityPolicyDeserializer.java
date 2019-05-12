package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.DIVERSITY_POLICY;
import org.kyojo.schemaorg.m3n5.pending.Container.DiversityPolicy;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DiversityPolicyDeserializer implements JsonDeserializer<DiversityPolicy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DiversityPolicy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIVERSITY_POLICY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIVERSITY_POLICY(), DiversityPolicy.class, DIVERSITY_POLICY.class, fldMap);
	}

}
