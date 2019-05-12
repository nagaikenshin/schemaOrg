package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VIDEO_GAME;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoGame;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VideoGameDeserializer implements JsonDeserializer<VideoGame> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VideoGame deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VIDEO_GAME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VIDEO_GAME(), VideoGame.class, VIDEO_GAME.class, fldMap);
	}

}
