package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MUSIC_RELEASE_FORMAT;
import org.kyojo.schemaorg.m3n4.core.Container.MusicReleaseFormat;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MusicReleaseFormatDeserializer implements JsonDeserializer<MusicReleaseFormat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MusicReleaseFormat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MUSIC_RELEASE_FORMAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MUSIC_RELEASE_FORMAT(), MusicReleaseFormat.class, MUSIC_RELEASE_FORMAT.class, fldMap);
	}

}
