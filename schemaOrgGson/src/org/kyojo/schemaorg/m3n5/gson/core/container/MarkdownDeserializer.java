package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MARKDOWN;
import org.kyojo.schemaorg.m3n5.core.Container.Markdown;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MarkdownDeserializer implements JsonDeserializer<Markdown> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Markdown deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MARKDOWN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MARKDOWN(), Markdown.class, MARKDOWN.class, fldMap);
	}

}