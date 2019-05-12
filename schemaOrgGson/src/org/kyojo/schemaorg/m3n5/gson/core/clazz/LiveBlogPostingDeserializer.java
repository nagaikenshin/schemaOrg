package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LIVE_BLOG_POSTING;
import org.kyojo.schemaorg.m3n5.core.Clazz.LiveBlogPosting;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LiveBlogPostingDeserializer implements JsonDeserializer<LiveBlogPosting> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LiveBlogPosting deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LIVE_BLOG_POSTING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LIVE_BLOG_POSTING(), LiveBlogPosting.class, LIVE_BLOG_POSTING.class, fldMap);
	}

}
