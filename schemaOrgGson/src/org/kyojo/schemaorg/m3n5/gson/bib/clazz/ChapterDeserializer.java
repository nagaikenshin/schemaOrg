package org.kyojo.schemaorg.m3n5.gson.bib.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.bib.impl.CHAPTER;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Chapter;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ChapterDeserializer implements JsonDeserializer<Chapter> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Chapter deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CHAPTER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CHAPTER(), Chapter.class, CHAPTER.class, fldMap);
	}

}
