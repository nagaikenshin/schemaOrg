package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TECH_ARTICLE;
import org.kyojo.schemaorg.m3n5.core.Clazz.TechArticle;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TechArticleDeserializer implements JsonDeserializer<TechArticle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TechArticle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TECH_ARTICLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TECH_ARTICLE(), TechArticle.class, TECH_ARTICLE.class, fldMap);
	}

}
