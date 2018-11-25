package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.IN_ALBUM;
import org.kyojo.schemaorg.m3n4.core.Container.InAlbum;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class InAlbumDeserializer implements JsonDeserializer<InAlbum> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InAlbum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IN_ALBUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IN_ALBUM(), InAlbum.class, IN_ALBUM.class, fldMap);
	}

}
