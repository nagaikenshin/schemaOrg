package org.kyojo.schemaorg.m3n4.gson.core.bookFormatType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.bookFormatType.AUDIOBOOK_FORMAT;
import org.kyojo.schemaorg.m3n4.core.BookFormatType.AudiobookFormat;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AudiobookFormatDeserializer implements JsonDeserializer<AudiobookFormat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AudiobookFormat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AUDIOBOOK_FORMAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AUDIOBOOK_FORMAT(), AudiobookFormat.class, AUDIOBOOK_FORMAT.class, fldMap);
	}

}
