package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ALBUM_RELEASE_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.AlbumReleaseType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AlbumReleaseTypeDeserializer implements JsonDeserializer<AlbumReleaseType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AlbumReleaseType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ALBUM_RELEASE_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ALBUM_RELEASE_TYPE(), AlbumReleaseType.class, ALBUM_RELEASE_TYPE.class, fldMap);
	}

}
