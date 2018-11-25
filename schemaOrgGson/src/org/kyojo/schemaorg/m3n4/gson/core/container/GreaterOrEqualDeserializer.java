package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GREATER_OR_EQUAL;
import org.kyojo.schemaorg.m3n4.core.Container.GreaterOrEqual;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GreaterOrEqualDeserializer implements JsonDeserializer<GreaterOrEqual> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GreaterOrEqual deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GREATER_OR_EQUAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GREATER_OR_EQUAL(), GreaterOrEqual.class, GREATER_OR_EQUAL.class, fldMap);
	}

}
