package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.URL_TEMPLATE;
import org.kyojo.schemaorg.m3n5.core.Container.UrlTemplate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class UrlTemplateDeserializer implements JsonDeserializer<UrlTemplate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UrlTemplate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new URL_TEMPLATE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new URL_TEMPLATE(), UrlTemplate.class, URL_TEMPLATE.class, fldMap);
	}

}
