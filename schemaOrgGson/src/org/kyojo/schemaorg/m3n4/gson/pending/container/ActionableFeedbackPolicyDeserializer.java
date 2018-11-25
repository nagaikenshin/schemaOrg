package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.ACTIONABLE_FEEDBACK_POLICY;
import org.kyojo.schemaorg.m3n4.pending.Container.ActionableFeedbackPolicy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ActionableFeedbackPolicyDeserializer implements JsonDeserializer<ActionableFeedbackPolicy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ActionableFeedbackPolicy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACTIONABLE_FEEDBACK_POLICY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACTIONABLE_FEEDBACK_POLICY(), ActionableFeedbackPolicy.class, ACTIONABLE_FEEDBACK_POLICY.class, fldMap);
	}

}
