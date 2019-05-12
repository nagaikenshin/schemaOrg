package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PROVIDES_BROADCAST_SERVICE;
import org.kyojo.schemaorg.m3n5.core.Container.ProvidesBroadcastService;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ProvidesBroadcastServiceDeserializer implements JsonDeserializer<ProvidesBroadcastService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProvidesBroadcastService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROVIDES_BROADCAST_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROVIDES_BROADCAST_SERVICE(), ProvidesBroadcastService.class, PROVIDES_BROADCAST_SERVICE.class, fldMap);
	}

}
