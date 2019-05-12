package org.kyojo.schemaorg.m3n5.gson.core.musicReleaseFormatType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.musicReleaseFormatType.VINYL_FORMAT;
import org.kyojo.schemaorg.m3n5.core.MusicReleaseFormatType.VinylFormat;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VinylFormatDeserializer implements JsonDeserializer<VinylFormat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VinylFormat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VINYL_FORMAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VINYL_FORMAT(), VinylFormat.class, VINYL_FORMAT.class, fldMap);
	}

}
