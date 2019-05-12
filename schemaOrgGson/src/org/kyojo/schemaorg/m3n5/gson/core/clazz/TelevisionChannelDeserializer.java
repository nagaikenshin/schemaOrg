package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TELEVISION_CHANNEL;
import org.kyojo.schemaorg.m3n5.core.Clazz.TelevisionChannel;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TelevisionChannelDeserializer implements JsonDeserializer<TelevisionChannel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TelevisionChannel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TELEVISION_CHANNEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TELEVISION_CHANNEL(), TelevisionChannel.class, TELEVISION_CHANNEL.class, fldMap);
	}

}
