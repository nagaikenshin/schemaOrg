package org.kyojo.schemaorg.m3n5.gson.core.musicAlbumProductionType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.musicAlbumProductionType.DJ_MIX_ALBUM;
import org.kyojo.schemaorg.m3n5.core.MusicAlbumProductionType.DJMixAlbum;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DJMixAlbumDeserializer implements JsonDeserializer<DJMixAlbum> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DJMixAlbum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DJ_MIX_ALBUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DJ_MIX_ALBUM(), DJMixAlbum.class, DJ_MIX_ALBUM.class, fldMap);
	}

}
