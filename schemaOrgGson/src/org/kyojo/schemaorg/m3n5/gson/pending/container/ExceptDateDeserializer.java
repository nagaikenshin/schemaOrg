package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.EXCEPT_DATE;
import org.kyojo.schemaorg.m3n5.pending.Container.ExceptDate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ExceptDateDeserializer implements JsonDeserializer<ExceptDate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExceptDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new EXCEPT_DATE(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXCEPT_DATE(), ExceptDate.class, EXCEPT_DATE.class, fldMap);
	}

}
