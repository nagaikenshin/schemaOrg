package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MUSIC_ALBUM_PRODUCTION_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicAlbumProductionType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MusicAlbumProductionTypeDeserializer implements JsonDeserializer<MusicAlbumProductionType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MusicAlbumProductionType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MUSIC_ALBUM_PRODUCTION_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MUSIC_ALBUM_PRODUCTION_TYPE(), MusicAlbumProductionType.class, MUSIC_ALBUM_PRODUCTION_TYPE.class, fldMap);
	}

}
