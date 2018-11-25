package org.kyojo.schemaorg.m3n4.gson.core.musicAlbumReleaseType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.musicAlbumReleaseType.BROADCAST_RELEASE;
import org.kyojo.schemaorg.m3n4.core.MusicAlbumReleaseType.BroadcastRelease;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BroadcastReleaseDeserializer implements JsonDeserializer<BroadcastRelease> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BroadcastRelease deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROADCAST_RELEASE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROADCAST_RELEASE(), BroadcastRelease.class, BROADCAST_RELEASE.class, fldMap);
	}

}
