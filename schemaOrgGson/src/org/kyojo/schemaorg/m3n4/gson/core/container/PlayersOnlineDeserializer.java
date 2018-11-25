package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PLAYERS_ONLINE;
import org.kyojo.schemaorg.m3n4.core.Container.PlayersOnline;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PlayersOnlineDeserializer implements JsonDeserializer<PlayersOnline> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PlayersOnline deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new PLAYERS_ONLINE(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PLAYERS_ONLINE(), PlayersOnline.class, PLAYERS_ONLINE.class, fldMap);
	}

}
