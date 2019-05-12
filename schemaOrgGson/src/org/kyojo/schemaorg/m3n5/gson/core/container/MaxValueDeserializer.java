package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MAX_VALUE;
import org.kyojo.schemaorg.m3n5.core.Container.MaxValue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MaxValueDeserializer implements JsonDeserializer<MaxValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MaxValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MAX_VALUE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MAX_VALUE(), MaxValue.class, MAX_VALUE.class, fldMap);
	}

}
