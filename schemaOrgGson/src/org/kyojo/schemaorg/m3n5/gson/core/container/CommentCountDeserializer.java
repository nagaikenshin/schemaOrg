package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COMMENT_COUNT;
import org.kyojo.schemaorg.m3n5.core.Container.CommentCount;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CommentCountDeserializer implements JsonDeserializer<CommentCount> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CommentCount deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new COMMENT_COUNT(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMMENT_COUNT(), CommentCount.class, COMMENT_COUNT.class, fldMap);
	}

}
