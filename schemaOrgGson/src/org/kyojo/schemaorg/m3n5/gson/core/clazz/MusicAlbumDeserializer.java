package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_ALBUM;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicAlbum;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MusicAlbumDeserializer implements JsonDeserializer<MusicAlbum> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MusicAlbum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MUSIC_ALBUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MUSIC_ALBUM(), MusicAlbum.class, MUSIC_ALBUM.class, fldMap);
	}

}
