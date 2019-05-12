package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CONTENT_LOCATION;
import org.kyojo.schemaorg.m3n5.core.Container.ContentLocation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ContentLocationDeserializer implements JsonDeserializer<ContentLocation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ContentLocation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONTENT_LOCATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTENT_LOCATION(), ContentLocation.class, CONTENT_LOCATION.class, fldMap);
	}

}
