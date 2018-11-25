package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.FM_RADIO_CHANNEL;
import org.kyojo.schemaorg.m3n4.pending.Clazz.FMRadioChannel;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FMRadioChannelDeserializer implements JsonDeserializer<FMRadioChannel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FMRadioChannel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FM_RADIO_CHANNEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FM_RADIO_CHANNEL(), FMRadioChannel.class, FM_RADIO_CHANNEL.class, fldMap);
	}

}
