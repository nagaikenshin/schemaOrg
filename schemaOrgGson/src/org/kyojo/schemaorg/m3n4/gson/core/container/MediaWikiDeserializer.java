package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MEDIA_WIKI;
import org.kyojo.schemaorg.m3n4.core.Container.MediaWiki;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MediaWikiDeserializer implements JsonDeserializer<MediaWiki> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MediaWiki deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDIA_WIKI(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDIA_WIKI(), MediaWiki.class, MEDIA_WIKI.class, fldMap);
	}

}
