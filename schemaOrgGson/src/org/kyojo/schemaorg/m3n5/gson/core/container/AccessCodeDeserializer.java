package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ACCESS_CODE;
import org.kyojo.schemaorg.m3n5.core.Container.AccessCode;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AccessCodeDeserializer implements JsonDeserializer<AccessCode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AccessCode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACCESS_CODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACCESS_CODE(), AccessCode.class, ACCESS_CODE.class, fldMap);
	}

}
