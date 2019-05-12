package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COVERAGE_START_TIME;
import org.kyojo.schemaorg.m3n5.core.Container.CoverageStartTime;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CoverageStartTimeDeserializer implements JsonDeserializer<CoverageStartTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CoverageStartTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new COVERAGE_START_TIME(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COVERAGE_START_TIME(), CoverageStartTime.class, COVERAGE_START_TIME.class, fldMap);
	}

}
