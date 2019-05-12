package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LIVE_BLOG_UPDATE;
import org.kyojo.schemaorg.m3n5.core.Container.LiveBlogUpdate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LiveBlogUpdateDeserializer implements JsonDeserializer<LiveBlogUpdate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LiveBlogUpdate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LIVE_BLOG_UPDATE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LIVE_BLOG_UPDATE(), LiveBlogUpdate.class, LIVE_BLOG_UPDATE.class, fldMap);
	}

}