package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.ASK_PUBLIC_NEWS_ARTICLE;
import org.kyojo.schemaorg.m3n5.pending.Clazz.AskPublicNewsArticle;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AskPublicNewsArticleDeserializer implements JsonDeserializer<AskPublicNewsArticle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AskPublicNewsArticle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ASK_PUBLIC_NEWS_ARTICLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ASK_PUBLIC_NEWS_ARTICLE(), AskPublicNewsArticle.class, ASK_PUBLIC_NEWS_ARTICLE.class, fldMap);
	}

}
