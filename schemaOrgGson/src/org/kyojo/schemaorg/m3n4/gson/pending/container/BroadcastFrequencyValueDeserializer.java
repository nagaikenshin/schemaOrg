package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.BROADCAST_FREQUENCY_VALUE;
import org.kyojo.schemaorg.m3n4.pending.Container.BroadcastFrequencyValue;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BroadcastFrequencyValueDeserializer implements JsonDeserializer<BroadcastFrequencyValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BroadcastFrequencyValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROADCAST_FREQUENCY_VALUE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROADCAST_FREQUENCY_VALUE(), BroadcastFrequencyValue.class, BROADCAST_FREQUENCY_VALUE.class, fldMap);
	}

}
