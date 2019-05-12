package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.SATIRICAL_ARTICLE;
import org.kyojo.schemaorg.m3n5.pending.Clazz.SatiricalArticle;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SatiricalArticleDeserializer implements JsonDeserializer<SatiricalArticle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SatiricalArticle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SATIRICAL_ARTICLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SATIRICAL_ARTICLE(), SatiricalArticle.class, SATIRICAL_ARTICLE.class, fldMap);
	}

}
