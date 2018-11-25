package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.OPINION_NEWS_ARTICLE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.OpinionNewsArticle;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OpinionNewsArticleDeserializer implements JsonDeserializer<OpinionNewsArticle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OpinionNewsArticle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OPINION_NEWS_ARTICLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OPINION_NEWS_ARTICLE(), OpinionNewsArticle.class, OPINION_NEWS_ARTICLE.class, fldMap);
	}

}
