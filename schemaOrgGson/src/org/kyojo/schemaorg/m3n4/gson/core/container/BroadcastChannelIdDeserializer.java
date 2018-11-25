package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BROADCAST_CHANNEL_ID;
import org.kyojo.schemaorg.m3n4.core.Container.BroadcastChannelId;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BroadcastChannelIdDeserializer implements JsonDeserializer<BroadcastChannelId> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BroadcastChannelId deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROADCAST_CHANNEL_ID(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROADCAST_CHANNEL_ID(), BroadcastChannelId.class, BROADCAST_CHANNEL_ID.class, fldMap);
	}

}
