package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.BACKGROUND_NEWS_ARTICLE;
import org.kyojo.schemaorg.m3n5.pending.Clazz.BackgroundNewsArticle;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BackgroundNewsArticleDeserializer implements JsonDeserializer<BackgroundNewsArticle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BackgroundNewsArticle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BACKGROUND_NEWS_ARTICLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BACKGROUND_NEWS_ARTICLE(), BackgroundNewsArticle.class, BACKGROUND_NEWS_ARTICLE.class, fldMap);
	}

}
