package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PUBLISHED_ON;
import org.kyojo.schemaorg.m3n4.core.Container.PublishedOn;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PublishedOnDeserializer implements JsonDeserializer<PublishedOn> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PublishedOn deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PUBLISHED_ON(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PUBLISHED_ON(), PublishedOn.class, PUBLISHED_ON.class, fldMap);
	}

}
