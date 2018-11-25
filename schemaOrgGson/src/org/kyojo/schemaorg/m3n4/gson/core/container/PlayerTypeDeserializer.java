package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PLAYER_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.PlayerType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PlayerTypeDeserializer implements JsonDeserializer<PlayerType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PlayerType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PLAYER_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PLAYER_TYPE(), PlayerType.class, PLAYER_TYPE.class, fldMap);
	}

}
