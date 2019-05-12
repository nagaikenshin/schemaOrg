package org.kyojo.schemaorg.m3n5.gson.core.musicAlbumProductionType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.musicAlbumProductionType.MIXTAPE_ALBUM;
import org.kyojo.schemaorg.m3n5.core.MusicAlbumProductionType.MixtapeAlbum;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MixtapeAlbumDeserializer implements JsonDeserializer<MixtapeAlbum> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MixtapeAlbum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MIXTAPE_ALBUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MIXTAPE_ALBUM(), MixtapeAlbum.class, MIXTAPE_ALBUM.class, fldMap);
	}

}
