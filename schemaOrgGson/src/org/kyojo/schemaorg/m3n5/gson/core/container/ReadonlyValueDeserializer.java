package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.READONLY_VALUE;
import org.kyojo.schemaorg.m3n5.core.Container.ReadonlyValue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReadonlyValueDeserializer implements JsonDeserializer<ReadonlyValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReadonlyValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new READONLY_VALUE(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new READONLY_VALUE(), ReadonlyValue.class, READONLY_VALUE.class, fldMap);
	}

}
