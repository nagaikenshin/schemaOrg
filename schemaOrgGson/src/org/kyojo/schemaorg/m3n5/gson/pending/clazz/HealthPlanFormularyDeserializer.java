package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_PLAN_FORMULARY;
import org.kyojo.schemaorg.m3n5.pending.Clazz.HealthPlanFormulary;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HealthPlanFormularyDeserializer implements JsonDeserializer<HealthPlanFormulary> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HealthPlanFormulary deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEALTH_PLAN_FORMULARY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEALTH_PLAN_FORMULARY(), HealthPlanFormulary.class, HEALTH_PLAN_FORMULARY.class, fldMap);
	}

}
