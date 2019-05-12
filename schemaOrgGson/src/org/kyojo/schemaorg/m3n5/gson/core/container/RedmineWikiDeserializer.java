package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.REDMINE_WIKI;
import org.kyojo.schemaorg.m3n5.core.Container.RedmineWiki;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RedmineWikiDeserializer implements JsonDeserializer<RedmineWiki> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RedmineWiki deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REDMINE_WIKI(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REDMINE_WIKI(), RedmineWiki.class, REDMINE_WIKI.class, fldMap);
	}

}
