package org.kyojo.schemaorg.m3n4.gson.core.musicReleaseFormatType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.musicReleaseFormatType.CD_FORMAT;
import org.kyojo.schemaorg.m3n4.core.MusicReleaseFormatType.CDFormat;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CDFormatDeserializer implements JsonDeserializer<CDFormat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CDFormat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CD_FORMAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CD_FORMAT(), CDFormat.class, CD_FORMAT.class, fldMap);
	}

}
