package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.REPLY_TO_URL;
import org.kyojo.schemaorg.m3n5.core.Container.ReplyToUrl;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReplyToUrlDeserializer implements JsonDeserializer<ReplyToUrl> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReplyToUrl deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REPLY_TO_URL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REPLY_TO_URL(), ReplyToUrl.class, REPLY_TO_URL.class, fldMap);
	}

}
