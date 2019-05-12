package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TYPICAL_AGE_RANGE;
import org.kyojo.schemaorg.m3n5.core.Container.TypicalAgeRange;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TypicalAgeRangeDeserializer implements JsonDeserializer<TypicalAgeRange> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TypicalAgeRange deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TYPICAL_AGE_RANGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TYPICAL_AGE_RANGE(), TypicalAgeRange.class, TYPICAL_AGE_RANGE.class, fldMap);
	}

}
