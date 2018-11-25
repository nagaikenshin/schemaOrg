package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.HEALTH_CONDITION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.HealthCondition;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HealthConditionDeserializer implements JsonDeserializer<HealthCondition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HealthCondition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEALTH_CONDITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEALTH_CONDITION(), HealthCondition.class, HEALTH_CONDITION.class, fldMap);
	}

}
