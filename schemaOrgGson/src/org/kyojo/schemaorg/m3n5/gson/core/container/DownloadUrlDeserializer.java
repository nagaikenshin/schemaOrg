package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DOWNLOAD_URL;
import org.kyojo.schemaorg.m3n5.core.Container.DownloadUrl;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DownloadUrlDeserializer implements JsonDeserializer<DownloadUrl> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DownloadUrl deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DOWNLOAD_URL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DOWNLOAD_URL(), DownloadUrl.class, DOWNLOAD_URL.class, fldMap);
	}

}
