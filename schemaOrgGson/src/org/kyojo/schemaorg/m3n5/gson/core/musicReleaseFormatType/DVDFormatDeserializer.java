package org.kyojo.schemaorg.m3n5.gson.core.musicReleaseFormatType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.musicReleaseFormatType.DVD_FORMAT;
import org.kyojo.schemaorg.m3n5.core.MusicReleaseFormatType.DVDFormat;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DVDFormatDeserializer implements JsonDeserializer<DVDFormat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DVDFormat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DVD_FORMAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DVD_FORMAT(), DVDFormat.class, DVD_FORMAT.class, fldMap);
	}

}
