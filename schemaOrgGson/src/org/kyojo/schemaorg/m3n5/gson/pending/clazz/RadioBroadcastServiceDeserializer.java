package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.RADIO_BROADCAST_SERVICE;
import org.kyojo.schemaorg.m3n5.pending.Clazz.RadioBroadcastService;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RadioBroadcastServiceDeserializer implements JsonDeserializer<RadioBroadcastService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RadioBroadcastService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RADIO_BROADCAST_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RADIO_BROADCAST_SERVICE(), RadioBroadcastService.class, RADIO_BROADCAST_SERVICE.class, fldMap);
	}

}
