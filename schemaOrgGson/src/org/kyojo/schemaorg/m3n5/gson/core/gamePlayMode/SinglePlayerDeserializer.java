package org.kyojo.schemaorg.m3n5.gson.core.gamePlayMode;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.gamePlayMode.SINGLE_PLAYER;
import org.kyojo.schemaorg.m3n5.core.GamePlayMode.SinglePlayer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SinglePlayerDeserializer implements JsonDeserializer<SinglePlayer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SinglePlayer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SINGLE_PLAYER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SINGLE_PLAYER(), SinglePlayer.class, SINGLE_PLAYER.class, fldMap);
	}

}
