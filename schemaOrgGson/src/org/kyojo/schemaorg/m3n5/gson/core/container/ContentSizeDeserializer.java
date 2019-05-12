package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CONTENT_SIZE;
import org.kyojo.schemaorg.m3n5.core.Container.ContentSize;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ContentSizeDeserializer implements JsonDeserializer<ContentSize> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ContentSize deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONTENT_SIZE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTENT_SIZE(), ContentSize.class, CONTENT_SIZE.class, fldMap);
	}

}
