package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EMBED_URL;
import org.kyojo.schemaorg.m3n5.core.Container.EmbedUrl;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EmbedUrlDeserializer implements JsonDeserializer<EmbedUrl> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EmbedUrl deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EMBED_URL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EMBED_URL(), EmbedUrl.class, EMBED_URL.class, fldMap);
	}

}
