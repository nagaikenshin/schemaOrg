package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BROADCAST_FREQUENCY;
import org.kyojo.schemaorg.m3n5.core.Container.BroadcastFrequency;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BroadcastFrequencyDeserializer implements JsonDeserializer<BroadcastFrequency> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BroadcastFrequency deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROADCAST_FREQUENCY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROADCAST_FREQUENCY(), BroadcastFrequency.class, BROADCAST_FREQUENCY.class, fldMap);
	}

}
