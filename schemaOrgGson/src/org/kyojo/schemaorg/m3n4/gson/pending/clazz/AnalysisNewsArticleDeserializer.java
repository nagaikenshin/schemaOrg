package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.ANALYSIS_NEWS_ARTICLE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AnalysisNewsArticle;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AnalysisNewsArticleDeserializer implements JsonDeserializer<AnalysisNewsArticle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AnalysisNewsArticle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ANALYSIS_NEWS_ARTICLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ANALYSIS_NEWS_ARTICLE(), AnalysisNewsArticle.class, ANALYSIS_NEWS_ARTICLE.class, fldMap);
	}

}
