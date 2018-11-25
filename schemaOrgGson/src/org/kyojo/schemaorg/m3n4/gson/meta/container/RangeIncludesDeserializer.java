package org.kyojo.schemaorg.m3n4.gson.meta.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.meta.impl.RANGE_INCLUDES;
import org.kyojo.schemaorg.m3n4.meta.Container.RangeIncludes;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RangeIncludesDeserializer implements JsonDeserializer<RangeIncludes> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RangeIncludes deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RANGE_INCLUDES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RANGE_INCLUDES(), RangeIncludes.class, RANGE_INCLUDES.class, fldMap);
	}

}
