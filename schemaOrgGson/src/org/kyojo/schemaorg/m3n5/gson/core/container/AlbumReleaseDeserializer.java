package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ALBUM_RELEASE;
import org.kyojo.schemaorg.m3n5.core.Container.AlbumRelease;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AlbumReleaseDeserializer implements JsonDeserializer<AlbumRelease> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AlbumRelease deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ALBUM_RELEASE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ALBUM_RELEASE(), AlbumRelease.class, ALBUM_RELEASE.class, fldMap);
	}

}
