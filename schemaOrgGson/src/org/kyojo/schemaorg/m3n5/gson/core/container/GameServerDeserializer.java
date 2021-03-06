package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GAME_SERVER;
import org.kyojo.schemaorg.m3n5.core.Container.GameServer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GameServerDeserializer implements JsonDeserializer<GameServer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GameServer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GAME_SERVER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GAME_SERVER(), GameServer.class, GAME_SERVER.class, fldMap);
	}

}
