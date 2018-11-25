package org.kyojo.schemaorg.m3n4.gson.core.musicAlbumProductionType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.musicAlbumProductionType.SPOKEN_WORD_ALBUM;
import org.kyojo.schemaorg.m3n4.core.MusicAlbumProductionType.SpokenWordAlbum;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SpokenWordAlbumDeserializer implements JsonDeserializer<SpokenWordAlbum> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SpokenWordAlbum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPOKEN_WORD_ALBUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPOKEN_WORD_ALBUM(), SpokenWordAlbum.class, SPOKEN_WORD_ALBUM.class, fldMap);
	}

}
