package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VALUE_MIN_LENGTH;
import org.kyojo.schemaorg.m3n5.core.Container.ValueMinLength;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ValueMinLengthDeserializer implements JsonDeserializer<ValueMinLength> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ValueMinLength deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VALUE_MIN_LENGTH(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VALUE_MIN_LENGTH(), ValueMinLength.class, VALUE_MIN_LENGTH.class, fldMap);
	}

}
