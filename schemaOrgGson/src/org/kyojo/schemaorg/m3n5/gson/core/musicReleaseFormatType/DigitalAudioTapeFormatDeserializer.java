package org.kyojo.schemaorg.m3n5.gson.core.musicReleaseFormatType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.musicReleaseFormatType.DIGITAL_AUDIO_TAPE_FORMAT;
import org.kyojo.schemaorg.m3n5.core.MusicReleaseFormatType.DigitalAudioTapeFormat;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DigitalAudioTapeFormatDeserializer implements JsonDeserializer<DigitalAudioTapeFormat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DigitalAudioTapeFormat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIGITAL_AUDIO_TAPE_FORMAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIGITAL_AUDIO_TAPE_FORMAT(), DigitalAudioTapeFormat.class, DIGITAL_AUDIO_TAPE_FORMAT.class, fldMap);
	}

}
