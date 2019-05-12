package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.VERIFICATION_FACT_CHECKING_POLICY;
import org.kyojo.schemaorg.m3n5.pending.Container.VerificationFactCheckingPolicy;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VerificationFactCheckingPolicyDeserializer implements JsonDeserializer<VerificationFactCheckingPolicy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VerificationFactCheckingPolicy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VERIFICATION_FACT_CHECKING_POLICY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VERIFICATION_FACT_CHECKING_POLICY(), VerificationFactCheckingPolicy.class, VERIFICATION_FACT_CHECKING_POLICY.class, fldMap);
	}

}
