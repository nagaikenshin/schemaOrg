package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BROADCAST_SERVICE_TIER;
import org.kyojo.schemaorg.m3n5.core.Container.BroadcastServiceTier;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BroadcastServiceTierDeserializer implements JsonDeserializer<BroadcastServiceTier> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BroadcastServiceTier deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROADCAST_SERVICE_TIER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROADCAST_SERVICE_TIER(), BroadcastServiceTier.class, BROADCAST_SERVICE_TIER.class, fldMap);
	}

}
