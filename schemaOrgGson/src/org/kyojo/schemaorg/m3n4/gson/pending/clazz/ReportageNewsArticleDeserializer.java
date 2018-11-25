package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.REPORTAGE_NEWS_ARTICLE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ReportageNewsArticle;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ReportageNewsArticleDeserializer implements JsonDeserializer<ReportageNewsArticle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReportageNewsArticle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REPORTAGE_NEWS_ARTICLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REPORTAGE_NEWS_ARTICLE(), ReportageNewsArticle.class, REPORTAGE_NEWS_ARTICLE.class, fldMap);
	}

}
