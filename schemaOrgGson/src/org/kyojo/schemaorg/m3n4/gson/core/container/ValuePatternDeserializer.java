package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.VALUE_PATTERN;
import org.kyojo.schemaorg.m3n4.core.Container.ValuePattern;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ValuePatternDeserializer implements JsonDeserializer<ValuePattern> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ValuePattern deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VALUE_PATTERN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VALUE_PATTERN(), ValuePattern.class, VALUE_PATTERN.class, fldMap);
	}

}
