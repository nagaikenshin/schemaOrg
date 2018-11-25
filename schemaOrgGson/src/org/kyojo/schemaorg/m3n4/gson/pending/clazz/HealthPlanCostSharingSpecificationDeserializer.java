package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.HEALTH_PLAN_COST_SHARING_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.HealthPlanCostSharingSpecification;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HealthPlanCostSharingSpecificationDeserializer implements JsonDeserializer<HealthPlanCostSharingSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HealthPlanCostSharingSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEALTH_PLAN_COST_SHARING_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEALTH_PLAN_COST_SHARING_SPECIFICATION(), HealthPlanCostSharingSpecification.class, HEALTH_PLAN_COST_SHARING_SPECIFICATION.class, fldMap);
	}

}
