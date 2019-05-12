package org.kyojo.schemaorg.m3n5.gson.core.musicAlbumProductionType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.musicAlbumProductionType.COMPILATION_ALBUM;
import org.kyojo.schemaorg.m3n5.core.MusicAlbumProductionType.CompilationAlbum;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CompilationAlbumDeserializer implements JsonDeserializer<CompilationAlbum> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CompilationAlbum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMPILATION_ALBUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMPILATION_ALBUM(), CompilationAlbum.class, COMPILATION_ALBUM.class, fldMap);
	}

}
