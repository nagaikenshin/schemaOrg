package org.kyojo.schemaorg.m3n5.gson.core.musicReleaseFormatType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.musicReleaseFormatType.CASSETTE_FORMAT;
import org.kyojo.schemaorg.m3n5.core.MusicReleaseFormatType.CassetteFormat;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CassetteFormatDeserializer implements JsonDeserializer<CassetteFormat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CassetteFormat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CASSETTE_FORMAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CASSETTE_FORMAT(), CassetteFormat.class, CASSETTE_FORMAT.class, fldMap);
	}

}
