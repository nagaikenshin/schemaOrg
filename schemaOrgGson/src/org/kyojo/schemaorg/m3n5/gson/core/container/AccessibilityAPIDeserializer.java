package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ACCESSIBILITY_API;
import org.kyojo.schemaorg.m3n5.core.Container.AccessibilityAPI;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AccessibilityAPIDeserializer implements JsonDeserializer<AccessibilityAPI> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AccessibilityAPI deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACCESSIBILITY_API(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACCESSIBILITY_API(), AccessibilityAPI.class, ACCESSIBILITY_API.class, fldMap);
	}

}
