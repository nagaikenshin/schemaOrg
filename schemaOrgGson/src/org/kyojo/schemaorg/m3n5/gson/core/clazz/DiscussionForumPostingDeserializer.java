package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DISCUSSION_FORUM_POSTING;
import org.kyojo.schemaorg.m3n5.core.Clazz.DiscussionForumPosting;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DiscussionForumPostingDeserializer implements JsonDeserializer<DiscussionForumPosting> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DiscussionForumPosting deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DISCUSSION_FORUM_POSTING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DISCUSSION_FORUM_POSTING(), DiscussionForumPosting.class, DISCUSSION_FORUM_POSTING.class, fldMap);
	}

}
