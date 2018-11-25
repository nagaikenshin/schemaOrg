package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CONTENT_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.ContentType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ContentTypeDeserializer implements JsonDeserializer<ContentType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ContentType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONTENT_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTENT_TYPE(), ContentType.class, CONTENT_TYPE.class, fldMap);
	}

}
