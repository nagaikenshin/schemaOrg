package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.MISSION_COVERAGE_PRIORITIES_POLICY;
import org.kyojo.schemaorg.m3n5.pending.Container.MissionCoveragePrioritiesPolicy;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MissionCoveragePrioritiesPolicyDeserializer implements JsonDeserializer<MissionCoveragePrioritiesPolicy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MissionCoveragePrioritiesPolicy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MISSION_COVERAGE_PRIORITIES_POLICY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MISSION_COVERAGE_PRIORITIES_POLICY(), MissionCoveragePrioritiesPolicy.class, MISSION_COVERAGE_PRIORITIES_POLICY.class, fldMap);
	}

}
