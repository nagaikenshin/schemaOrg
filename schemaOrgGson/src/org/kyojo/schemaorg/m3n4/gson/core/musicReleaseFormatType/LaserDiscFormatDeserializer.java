package org.kyojo.schemaorg.m3n4.gson.core.musicReleaseFormatType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.musicReleaseFormatType.LASER_DISC_FORMAT;
import org.kyojo.schemaorg.m3n4.core.MusicReleaseFormatType.LaserDiscFormat;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LaserDiscFormatDeserializer implements JsonDeserializer<LaserDiscFormat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LaserDiscFormat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LASER_DISC_FORMAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LASER_DISC_FORMAT(), LaserDiscFormat.class, LASER_DISC_FORMAT.class, fldMap);
	}

}
