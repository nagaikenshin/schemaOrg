package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EXIF_DATA;
import org.kyojo.schemaorg.m3n5.core.Container.ExifData;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ExifDataDeserializer implements JsonDeserializer<ExifData> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExifData deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EXIF_DATA(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXIF_DATA(), ExifData.class, EXIF_DATA.class, fldMap);
	}

}
