package org.kyojo.schemaorg.m3n4.gson.core.musicAlbumProductionType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.musicAlbumProductionType.SOUNDTRACK_ALBUM;
import org.kyojo.schemaorg.m3n4.core.MusicAlbumProductionType.SoundtrackAlbum;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SoundtrackAlbumDeserializer implements JsonDeserializer<SoundtrackAlbum> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SoundtrackAlbum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SOUNDTRACK_ALBUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SOUNDTRACK_ALBUM(), SoundtrackAlbum.class, SOUNDTRACK_ALBUM.class, fldMap);
	}

}
