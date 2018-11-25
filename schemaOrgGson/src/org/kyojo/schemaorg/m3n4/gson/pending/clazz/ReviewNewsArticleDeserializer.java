package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.REVIEW_NEWS_ARTICLE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ReviewNewsArticle;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ReviewNewsArticleDeserializer implements JsonDeserializer<ReviewNewsArticle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReviewNewsArticle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REVIEW_NEWS_ARTICLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REVIEW_NEWS_ARTICLE(), ReviewNewsArticle.class, REVIEW_NEWS_ARTICLE.class, fldMap);
	}

}
