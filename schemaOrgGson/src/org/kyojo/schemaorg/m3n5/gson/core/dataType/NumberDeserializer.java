package org.kyojo.schemaorg.m3n5.gson.core.dataType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.NUMBER;
import org.kyojo.schemaorg.m3n5.core.DataType.Number;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NumberDeserializer implements JsonDeserializer<Number> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Number deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new NUMBER(jsonElement.getAsBigDecimal());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER(), Number.class, NUMBER.class, fldMap);
	}

}
