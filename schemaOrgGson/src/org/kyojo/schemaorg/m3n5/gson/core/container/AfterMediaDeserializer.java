package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.AFTER_MEDIA;
import org.kyojo.schemaorg.m3n5.core.Container.AfterMedia;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AfterMediaDeserializer implements JsonDeserializer<AfterMedia> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AfterMedia deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AFTER_MEDIA(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AFTER_MEDIA(), AfterMedia.class, AFTER_MEDIA.class, fldMap);
	}

}
