package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.THUMBNAIL_URL;
import org.kyojo.schemaorg.m3n4.core.Container.ThumbnailUrl;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ThumbnailUrlDeserializer implements JsonDeserializer<ThumbnailUrl> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ThumbnailUrl deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new THUMBNAIL_URL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new THUMBNAIL_URL(), ThumbnailUrl.class, THUMBNAIL_URL.class, fldMap);
	}

}
