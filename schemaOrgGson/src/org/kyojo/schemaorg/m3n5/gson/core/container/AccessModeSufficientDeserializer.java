package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ACCESS_MODE_SUFFICIENT;
import org.kyojo.schemaorg.m3n5.core.Container.AccessModeSufficient;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AccessModeSufficientDeserializer implements JsonDeserializer<AccessModeSufficient> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AccessModeSufficient deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACCESS_MODE_SUFFICIENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACCESS_MODE_SUFFICIENT(), AccessModeSufficient.class, ACCESS_MODE_SUFFICIENT.class, fldMap);
	}

}
