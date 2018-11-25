package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.COMMENT_TEXT;
import org.kyojo.schemaorg.m3n4.core.Container.CommentText;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CommentTextDeserializer implements JsonDeserializer<CommentText> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CommentText deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMMENT_TEXT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMMENT_TEXT(), CommentText.class, COMMENT_TEXT.class, fldMap);
	}

}
