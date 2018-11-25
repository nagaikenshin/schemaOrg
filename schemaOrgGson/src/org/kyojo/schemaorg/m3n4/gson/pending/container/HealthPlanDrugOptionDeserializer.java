package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.HEALTH_PLAN_DRUG_OPTION;
import org.kyojo.schemaorg.m3n4.pending.Container.HealthPlanDrugOption;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HealthPlanDrugOptionDeserializer implements JsonDeserializer<HealthPlanDrugOption> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HealthPlanDrugOption deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEALTH_PLAN_DRUG_OPTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEALTH_PLAN_DRUG_OPTION(), HealthPlanDrugOption.class, HEALTH_PLAN_DRUG_OPTION.class, fldMap);
	}

}
