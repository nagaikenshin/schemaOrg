package org.kyojo.schemaorg.m3n4.gson.core.musicAlbumProductionType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.musicAlbumProductionType.DEMO_ALBUM;
import org.kyojo.schemaorg.m3n4.core.MusicAlbumProductionType.DemoAlbum;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DemoAlbumDeserializer implements JsonDeserializer<DemoAlbum> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DemoAlbum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DEMO_ALBUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DEMO_ALBUM(), DemoAlbum.class, DEMO_ALBUM.class, fldMap);
	}

}
