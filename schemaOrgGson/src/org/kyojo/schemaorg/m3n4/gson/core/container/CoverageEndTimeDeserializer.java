package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.COVERAGE_END_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.CoverageEndTime;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CoverageEndTimeDeserializer implements JsonDeserializer<CoverageEndTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CoverageEndTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new COVERAGE_END_TIME(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COVERAGE_END_TIME(), CoverageEndTime.class, COVERAGE_END_TIME.class, fldMap);
	}

}
