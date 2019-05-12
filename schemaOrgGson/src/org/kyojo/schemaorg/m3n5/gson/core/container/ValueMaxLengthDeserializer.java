package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VALUE_MAX_LENGTH;
import org.kyojo.schemaorg.m3n5.core.Container.ValueMaxLength;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ValueMaxLengthDeserializer implements JsonDeserializer<ValueMaxLength> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ValueMaxLength deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VALUE_MAX_LENGTH(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VALUE_MAX_LENGTH(), ValueMaxLength.class, VALUE_MAX_LENGTH.class, fldMap);
	}

}
