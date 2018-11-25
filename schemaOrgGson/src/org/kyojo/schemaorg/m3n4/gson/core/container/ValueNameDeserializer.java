package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.VALUE_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.ValueName;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ValueNameDeserializer implements JsonDeserializer<ValueName> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ValueName deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VALUE_NAME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VALUE_NAME(), ValueName.class, VALUE_NAME.class, fldMap);
	}

}
