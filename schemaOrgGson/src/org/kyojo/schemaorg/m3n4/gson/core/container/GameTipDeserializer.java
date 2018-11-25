package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GAME_TIP;
import org.kyojo.schemaorg.m3n4.core.Container.GameTip;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GameTipDeserializer implements JsonDeserializer<GameTip> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GameTip deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GAME_TIP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GAME_TIP(), GameTip.class, GAME_TIP.class, fldMap);
	}

}
