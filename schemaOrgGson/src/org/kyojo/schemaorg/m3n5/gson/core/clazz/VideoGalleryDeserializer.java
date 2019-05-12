package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VIDEO_GALLERY;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoGallery;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VideoGalleryDeserializer implements JsonDeserializer<VideoGallery> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VideoGallery deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VIDEO_GALLERY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VIDEO_GALLERY(), VideoGallery.class, VIDEO_GALLERY.class, fldMap);
	}

}
