package org.kyojo.schemaorg.m3n5.gson.core.musicAlbumProductionType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.musicAlbumProductionType.REMIX_ALBUM;
import org.kyojo.schemaorg.m3n5.core.MusicAlbumProductionType.RemixAlbum;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RemixAlbumDeserializer implements JsonDeserializer<RemixAlbum> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RemixAlbum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REMIX_ALBUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REMIX_ALBUM(), RemixAlbum.class, REMIX_ALBUM.class, fldMap);
	}

}
