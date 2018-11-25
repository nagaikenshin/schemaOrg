package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PAGE_START;
import org.kyojo.schemaorg.m3n4.core.Container.PageStart;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PageStartDeserializer implements JsonDeserializer<PageStart> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PageStart deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAGE_START(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAGE_START(), PageStart.class, PAGE_START.class, fldMap);
	}

}
