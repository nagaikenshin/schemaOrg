package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.HEALTH_PLAN_COINSURANCE_RATE;
import org.kyojo.schemaorg.m3n4.pending.Container.HealthPlanCoinsuranceRate;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HealthPlanCoinsuranceRateDeserializer implements JsonDeserializer<HealthPlanCoinsuranceRate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HealthPlanCoinsuranceRate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEALTH_PLAN_COINSURANCE_RATE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEALTH_PLAN_COINSURANCE_RATE(), HealthPlanCoinsuranceRate.class, HEALTH_PLAN_COINSURANCE_RATE.class, fldMap);
	}

}
