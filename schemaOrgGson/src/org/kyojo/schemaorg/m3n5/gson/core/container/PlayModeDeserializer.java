package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PLAY_MODE;
import org.kyojo.schemaorg.m3n5.core.Container.PlayMode;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PlayModeDeserializer implements JsonDeserializer<PlayMode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PlayMode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PLAY_MODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PLAY_MODE(), PlayMode.class, PLAY_MODE.class, fldMap);
	}

}
