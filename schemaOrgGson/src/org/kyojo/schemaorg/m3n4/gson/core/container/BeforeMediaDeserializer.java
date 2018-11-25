package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BEFORE_MEDIA;
import org.kyojo.schemaorg.m3n4.core.Container.BeforeMedia;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BeforeMediaDeserializer implements JsonDeserializer<BeforeMedia> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BeforeMedia deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BEFORE_MEDIA(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BEFORE_MEDIA(), BeforeMedia.class, BEFORE_MEDIA.class, fldMap);
	}

}
