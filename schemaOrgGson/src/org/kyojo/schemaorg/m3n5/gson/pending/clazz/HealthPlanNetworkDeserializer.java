package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.HEALTH_PLAN_NETWORK;
import org.kyojo.schemaorg.m3n5.pending.Clazz.HealthPlanNetwork;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HealthPlanNetworkDeserializer implements JsonDeserializer<HealthPlanNetwork> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HealthPlanNetwork deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEALTH_PLAN_NETWORK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEALTH_PLAN_NETWORK(), HealthPlanNetwork.class, HEALTH_PLAN_NETWORK.class, fldMap);
	}

}
