package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.NEWS_MEDIA_ORGANIZATION;
import org.kyojo.schemaorg.m3n5.pending.Clazz.NewsMediaOrganization;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NewsMediaOrganizationDeserializer implements JsonDeserializer<NewsMediaOrganization> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NewsMediaOrganization deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NEWS_MEDIA_ORGANIZATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NEWS_MEDIA_ORGANIZATION(), NewsMediaOrganization.class, NEWS_MEDIA_ORGANIZATION.class, fldMap);
	}

}
