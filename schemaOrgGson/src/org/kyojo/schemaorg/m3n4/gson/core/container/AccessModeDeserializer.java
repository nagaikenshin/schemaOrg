package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ACCESS_MODE;
import org.kyojo.schemaorg.m3n4.core.Container.AccessMode;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AccessModeDeserializer implements JsonDeserializer<AccessMode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AccessMode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACCESS_MODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACCESS_MODE(), AccessMode.class, ACCESS_MODE.class, fldMap);
	}

}
