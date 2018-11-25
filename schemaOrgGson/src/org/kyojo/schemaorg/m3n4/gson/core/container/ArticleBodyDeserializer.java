package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ARTICLE_BODY;
import org.kyojo.schemaorg.m3n4.core.Container.ArticleBody;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ArticleBodyDeserializer implements JsonDeserializer<ArticleBody> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArticleBody deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ARTICLE_BODY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARTICLE_BODY(), ArticleBody.class, ARTICLE_BODY.class, fldMap);
	}

}
