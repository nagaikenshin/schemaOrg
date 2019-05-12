package org.kyojo.schemaorg.m3n5.gson.core.gameServerStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.gameServerStatus.ONLINE;
import org.kyojo.schemaorg.m3n5.core.GameServerStatus.Online;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OnlineDeserializer implements JsonDeserializer<Online> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Online deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ONLINE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ONLINE(), Online.class, ONLINE.class, fldMap);
	}

}
