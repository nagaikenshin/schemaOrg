package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.SHORT_STORY;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ShortStory;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ShortStoryDeserializer implements JsonDeserializer<ShortStory> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ShortStory deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SHORT_STORY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SHORT_STORY(), ShortStory.class, SHORT_STORY.class, fldMap);
	}

}
