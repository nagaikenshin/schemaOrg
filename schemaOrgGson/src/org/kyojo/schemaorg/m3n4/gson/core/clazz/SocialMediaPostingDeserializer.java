package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SOCIAL_MEDIA_POSTING;
import org.kyojo.schemaorg.m3n4.core.Clazz.SocialMediaPosting;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SocialMediaPostingDeserializer implements JsonDeserializer<SocialMediaPosting> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SocialMediaPosting deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SOCIAL_MEDIA_POSTING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SOCIAL_MEDIA_POSTING(), SocialMediaPosting.class, SOCIAL_MEDIA_POSTING.class, fldMap);
	}

}
