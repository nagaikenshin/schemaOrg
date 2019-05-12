package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VIDEO_FRAME_SIZE;
import org.kyojo.schemaorg.m3n5.core.Container.VideoFrameSize;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VideoFrameSizeDeserializer implements JsonDeserializer<VideoFrameSize> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VideoFrameSize deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VIDEO_FRAME_SIZE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VIDEO_FRAME_SIZE(), VideoFrameSize.class, VIDEO_FRAME_SIZE.class, fldMap);
	}

}
