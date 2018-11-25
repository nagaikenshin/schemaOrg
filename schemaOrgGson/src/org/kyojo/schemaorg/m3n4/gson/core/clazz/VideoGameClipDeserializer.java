package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.VIDEO_GAME_CLIP;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGameClip;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class VideoGameClipDeserializer implements JsonDeserializer<VideoGameClip> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VideoGameClip deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VIDEO_GAME_CLIP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VIDEO_GAME_CLIP(), VideoGameClip.class, VIDEO_GAME_CLIP.class, fldMap);
	}

}
