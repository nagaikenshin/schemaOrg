package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.BROADCAST_SUB_CHANNEL;
import org.kyojo.schemaorg.m3n5.pending.Container.BroadcastSubChannel;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BroadcastSubChannelDeserializer implements JsonDeserializer<BroadcastSubChannel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BroadcastSubChannel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROADCAST_SUB_CHANNEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROADCAST_SUB_CHANNEL(), BroadcastSubChannel.class, BROADCAST_SUB_CHANNEL.class, fldMap);
	}

}
