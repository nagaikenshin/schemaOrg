package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SPATIAL_COVERAGE;
import org.kyojo.schemaorg.m3n5.core.Container.SpatialCoverage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SpatialCoverageDeserializer implements JsonDeserializer<SpatialCoverage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SpatialCoverage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPATIAL_COVERAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPATIAL_COVERAGE(), SpatialCoverage.class, SPATIAL_COVERAGE.class, fldMap);
	}

}