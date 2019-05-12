package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.IS_LIVE_BROADCAST;
import org.kyojo.schemaorg.m3n5.core.Container.IsLiveBroadcast;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class IsLiveBroadcastDeserializer implements JsonDeserializer<IsLiveBroadcast> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IsLiveBroadcast deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IS_LIVE_BROADCAST(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IS_LIVE_BROADCAST(), IsLiveBroadcast.class, IS_LIVE_BROADCAST.class, fldMap);
	}

}
