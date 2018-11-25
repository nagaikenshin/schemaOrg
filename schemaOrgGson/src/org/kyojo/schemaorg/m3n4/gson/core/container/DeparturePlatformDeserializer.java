package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.DEPARTURE_PLATFORM;
import org.kyojo.schemaorg.m3n4.core.Container.DeparturePlatform;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DeparturePlatformDeserializer implements JsonDeserializer<DeparturePlatform> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DeparturePlatform deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DEPARTURE_PLATFORM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DEPARTURE_PLATFORM(), DeparturePlatform.class, DEPARTURE_PLATFORM.class, fldMap);
	}

}
