package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.USES_HEALTH_PLAN_ID_STANDARD;
import org.kyojo.schemaorg.m3n5.pending.Container.UsesHealthPlanIdStandard;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class UsesHealthPlanIdStandardDeserializer implements JsonDeserializer<UsesHealthPlanIdStandard> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UsesHealthPlanIdStandard deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new USES_HEALTH_PLAN_ID_STANDARD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new USES_HEALTH_PLAN_ID_STANDARD(), UsesHealthPlanIdStandard.class, USES_HEALTH_PLAN_ID_STANDARD.class, fldMap);
	}

}
