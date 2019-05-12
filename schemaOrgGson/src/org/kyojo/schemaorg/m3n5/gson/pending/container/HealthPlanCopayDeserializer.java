package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_PLAN_COPAY;
import org.kyojo.schemaorg.m3n5.pending.Container.HealthPlanCopay;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HealthPlanCopayDeserializer implements JsonDeserializer<HealthPlanCopay> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HealthPlanCopay deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEALTH_PLAN_COPAY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEALTH_PLAN_COPAY(), HealthPlanCopay.class, HEALTH_PLAN_COPAY.class, fldMap);
	}

}
