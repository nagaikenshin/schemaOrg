package org.kyojo.schemaorg.m3n4.gson.core.musicReleaseFormatType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.musicReleaseFormatType.DIGITAL_FORMAT;
import org.kyojo.schemaorg.m3n4.core.MusicReleaseFormatType.DigitalFormat;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DigitalFormatDeserializer implements JsonDeserializer<DigitalFormat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DigitalFormat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIGITAL_FORMAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIGITAL_FORMAT(), DigitalFormat.class, DIGITAL_FORMAT.class, fldMap);
	}

}
