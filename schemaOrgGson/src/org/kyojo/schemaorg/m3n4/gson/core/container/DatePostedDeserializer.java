package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.DATE_POSTED;
import org.kyojo.schemaorg.m3n4.core.Container.DatePosted;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DatePostedDeserializer implements JsonDeserializer<DatePosted> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DatePosted deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new DATE_POSTED(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DATE_POSTED(), DatePosted.class, DATE_POSTED.class, fldMap);
	}

}
