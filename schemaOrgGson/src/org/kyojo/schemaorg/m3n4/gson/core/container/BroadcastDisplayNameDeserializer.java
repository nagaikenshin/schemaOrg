package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BROADCAST_DISPLAY_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.BroadcastDisplayName;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BroadcastDisplayNameDeserializer implements JsonDeserializer<BroadcastDisplayName> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BroadcastDisplayName deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROADCAST_DISPLAY_NAME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROADCAST_DISPLAY_NAME(), BroadcastDisplayName.class, BROADCAST_DISPLAY_NAME.class, fldMap);
	}

}
