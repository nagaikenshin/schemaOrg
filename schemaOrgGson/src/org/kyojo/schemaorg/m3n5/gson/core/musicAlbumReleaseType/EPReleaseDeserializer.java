package org.kyojo.schemaorg.m3n5.gson.core.musicAlbumReleaseType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.musicAlbumReleaseType.EP_RELEASE;
import org.kyojo.schemaorg.m3n5.core.MusicAlbumReleaseType.EPRelease;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EPReleaseDeserializer implements JsonDeserializer<EPRelease> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EPRelease deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EP_RELEASE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EP_RELEASE(), EPRelease.class, EP_RELEASE.class, fldMap);
	}

}
