package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ASSOCIATED_ARTICLE;
import org.kyojo.schemaorg.m3n4.core.Container.AssociatedArticle;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AssociatedArticleDeserializer implements JsonDeserializer<AssociatedArticle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AssociatedArticle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ASSOCIATED_ARTICLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ASSOCIATED_ARTICLE(), AssociatedArticle.class, ASSOCIATED_ARTICLE.class, fldMap);
	}

}
