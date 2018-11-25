package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.HEALTH_PLAN_COINSURANCE_OPTION;
import org.kyojo.schemaorg.m3n4.pending.Container.HealthPlanCoinsuranceOption;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HealthPlanCoinsuranceOptionDeserializer implements JsonDeserializer<HealthPlanCoinsuranceOption> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HealthPlanCoinsuranceOption deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEALTH_PLAN_COINSURANCE_OPTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEALTH_PLAN_COINSURANCE_OPTION(), HealthPlanCoinsuranceOption.class, HEALTH_PLAN_COINSURANCE_OPTION.class, fldMap);
	}

}
