package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MIN_VALUE;
import org.kyojo.schemaorg.m3n5.core.Container.MinValue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MinValueDeserializer implements JsonDeserializer<MinValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MinValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MIN_VALUE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MIN_VALUE(), MinValue.class, MIN_VALUE.class, fldMap);
	}

}
