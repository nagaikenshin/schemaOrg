package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BROADCAST_TIMEZONE;
import org.kyojo.schemaorg.m3n5.core.Container.BroadcastTimezone;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BroadcastTimezoneDeserializer implements JsonDeserializer<BroadcastTimezone> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BroadcastTimezone deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROADCAST_TIMEZONE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROADCAST_TIMEZONE(), BroadcastTimezone.class, BROADCAST_TIMEZONE.class, fldMap);
	}

}
