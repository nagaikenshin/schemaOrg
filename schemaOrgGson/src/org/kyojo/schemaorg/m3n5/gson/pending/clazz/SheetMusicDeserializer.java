package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.SHEET_MUSIC;
import org.kyojo.schemaorg.m3n5.pending.Clazz.SheetMusic;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SheetMusicDeserializer implements JsonDeserializer<SheetMusic> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SheetMusic deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SHEET_MUSIC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SHEET_MUSIC(), SheetMusic.class, SHEET_MUSIC.class, fldMap);
	}

}
