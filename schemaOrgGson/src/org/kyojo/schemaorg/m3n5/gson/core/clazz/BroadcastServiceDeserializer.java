package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BROADCAST_SERVICE;
import org.kyojo.schemaorg.m3n5.core.Clazz.BroadcastService;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BroadcastServiceDeserializer implements JsonDeserializer<BroadcastService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BroadcastService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROADCAST_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROADCAST_SERVICE(), BroadcastService.class, BROADCAST_SERVICE.class, fldMap);
	}

}
