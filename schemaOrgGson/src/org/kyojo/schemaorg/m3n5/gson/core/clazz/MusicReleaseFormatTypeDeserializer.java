package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_RELEASE_FORMAT_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicReleaseFormatType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MusicReleaseFormatTypeDeserializer implements JsonDeserializer<MusicReleaseFormatType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MusicReleaseFormatType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MUSIC_RELEASE_FORMAT_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MUSIC_RELEASE_FORMAT_TYPE(), MusicReleaseFormatType.class, MUSIC_RELEASE_FORMAT_TYPE.class, fldMap);
	}

}
