package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PUKI_WIKI;
import org.kyojo.schemaorg.m3n4.core.Clazz.PukiWiki;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PukiWikiDeserializer implements JsonDeserializer<PukiWiki> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PukiWiki deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PUKI_WIKI(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PUKI_WIKI(), PukiWiki.class, PUKI_WIKI.class, fldMap);
	}

}
