package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.ADVERTISER_CONTENT_ARTICLE;
import org.kyojo.schemaorg.m3n5.pending.Clazz.AdvertiserContentArticle;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AdvertiserContentArticleDeserializer implements JsonDeserializer<AdvertiserContentArticle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AdvertiserContentArticle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ADVERTISER_CONTENT_ARTICLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ADVERTISER_CONTENT_ARTICLE(), AdvertiserContentArticle.class, ADVERTISER_CONTENT_ARTICLE.class, fldMap);
	}

}
