package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.IN_PLAYLIST;
import org.kyojo.schemaorg.m3n4.core.Container.InPlaylist;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class InPlaylistDeserializer implements JsonDeserializer<InPlaylist> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InPlaylist deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IN_PLAYLIST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IN_PLAYLIST(), InPlaylist.class, IN_PLAYLIST.class, fldMap);
	}

}
