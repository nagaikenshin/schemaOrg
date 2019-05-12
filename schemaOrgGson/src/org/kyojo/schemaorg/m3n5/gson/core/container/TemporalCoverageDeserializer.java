package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TEMPORAL_COVERAGE;
import org.kyojo.schemaorg.m3n5.core.Container.TemporalCoverage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TemporalCoverageDeserializer implements JsonDeserializer<TemporalCoverage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TemporalCoverage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TEMPORAL_COVERAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TEMPORAL_COVERAGE(), TemporalCoverage.class, TEMPORAL_COVERAGE.class, fldMap);
	}

}
