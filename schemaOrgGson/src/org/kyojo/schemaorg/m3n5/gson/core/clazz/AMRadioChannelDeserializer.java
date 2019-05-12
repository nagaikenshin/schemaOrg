package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.AM_RADIO_CHANNEL;
import org.kyojo.schemaorg.m3n5.core.Clazz.AMRadioChannel;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AMRadioChannelDeserializer implements JsonDeserializer<AMRadioChannel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AMRadioChannel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AM_RADIO_CHANNEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AM_RADIO_CHANNEL(), AMRadioChannel.class, AM_RADIO_CHANNEL.class, fldMap);
	}

}
