package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ARRIVAL_PLATFORM;
import org.kyojo.schemaorg.m3n5.core.Container.ArrivalPlatform;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ArrivalPlatformDeserializer implements JsonDeserializer<ArrivalPlatform> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArrivalPlatform deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ARRIVAL_PLATFORM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARRIVAL_PLATFORM(), ArrivalPlatform.class, ARRIVAL_PLATFORM.class, fldMap);
	}

}
