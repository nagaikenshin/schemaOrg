package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_INSURANCE_PLAN;
import org.kyojo.schemaorg.m3n5.pending.Clazz.HealthInsurancePlan;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HealthInsurancePlanDeserializer implements JsonDeserializer<HealthInsurancePlan> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HealthInsurancePlan deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEALTH_INSURANCE_PLAN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEALTH_INSURANCE_PLAN(), HealthInsurancePlan.class, HEALTH_INSURANCE_PLAN.class, fldMap);
	}

}
