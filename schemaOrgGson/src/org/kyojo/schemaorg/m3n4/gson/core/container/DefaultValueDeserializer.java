package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.DEFAULT_VALUE;
import org.kyojo.schemaorg.m3n4.core.Container.DefaultValue;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DefaultValueDeserializer implements JsonDeserializer<DefaultValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DefaultValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DEFAULT_VALUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DEFAULT_VALUE(), DefaultValue.class, DEFAULT_VALUE.class, fldMap);
	}

}
