package org.kyojo.schemaorg.m3n5.gson.bib.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.bib.impl.COMIC_STORY;
import org.kyojo.schemaorg.m3n5.bib.Clazz.ComicStory;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ComicStoryDeserializer implements JsonDeserializer<ComicStory> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ComicStory deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMIC_STORY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMIC_STORY(), ComicStory.class, COMIC_STORY.class, fldMap);
	}

}
