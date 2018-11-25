package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.INCLUDED_IN_HEALTH_INSURANCE_PLAN;
import org.kyojo.schemaorg.m3n4.pending.Container.IncludedInHealthInsurancePlan;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IncludedInHealthInsurancePlanDeserializer implements JsonDeserializer<IncludedInHealthInsurancePlan> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IncludedInHealthInsurancePlan deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INCLUDED_IN_HEALTH_INSURANCE_PLAN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INCLUDED_IN_HEALTH_INSURANCE_PLAN(), IncludedInHealthInsurancePlan.class, INCLUDED_IN_HEALTH_INSURANCE_PLAN.class, fldMap);
	}

}
