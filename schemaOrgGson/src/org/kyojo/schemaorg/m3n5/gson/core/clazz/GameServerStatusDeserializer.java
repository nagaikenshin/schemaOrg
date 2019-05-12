package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GAME_SERVER_STATUS;
import org.kyojo.schemaorg.m3n5.core.Clazz.GameServerStatus;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GameServerStatusDeserializer implements JsonDeserializer<GameServerStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GameServerStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GAME_SERVER_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GAME_SERVER_STATUS(), GameServerStatus.class, GAME_SERVER_STATUS.class, fldMap);
	}

}
