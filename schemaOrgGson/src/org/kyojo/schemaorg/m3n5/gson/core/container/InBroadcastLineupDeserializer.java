package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.IN_BROADCAST_LINEUP;
import org.kyojo.schemaorg.m3n5.core.Container.InBroadcastLineup;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class InBroadcastLineupDeserializer implements JsonDeserializer<InBroadcastLineup> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InBroadcastLineup deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IN_BROADCAST_LINEUP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IN_BROADCAST_LINEUP(), InBroadcastLineup.class, IN_BROADCAST_LINEUP.class, fldMap);
	}

}
