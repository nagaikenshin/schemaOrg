package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.CONTENT_REFERENCE_TIME;
import org.kyojo.schemaorg.m3n5.pending.Container.ContentReferenceTime;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ContentReferenceTimeDeserializer implements JsonDeserializer<ContentReferenceTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ContentReferenceTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new CONTENT_REFERENCE_TIME(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTENT_REFERENCE_TIME(), ContentReferenceTime.class, CONTENT_REFERENCE_TIME.class, fldMap);
	}

}