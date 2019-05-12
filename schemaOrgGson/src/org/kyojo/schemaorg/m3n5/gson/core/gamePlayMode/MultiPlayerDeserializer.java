package org.kyojo.schemaorg.m3n5.gson.core.gamePlayMode;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.gamePlayMode.MULTI_PLAYER;
import org.kyojo.schemaorg.m3n5.core.GamePlayMode.MultiPlayer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MultiPlayerDeserializer implements JsonDeserializer<MultiPlayer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MultiPlayer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MULTI_PLAYER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MULTI_PLAYER(), MultiPlayer.class, MULTI_PLAYER.class, fldMap);
	}

}
