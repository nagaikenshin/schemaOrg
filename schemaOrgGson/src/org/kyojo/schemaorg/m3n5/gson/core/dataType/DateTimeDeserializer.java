package org.kyojo.schemaorg.m3n5.gson.core.dataType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DATE_TIME;
import org.kyojo.schemaorg.m3n5.core.DataType.DateTime;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DateTimeDeserializer implements JsonDeserializer<DateTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new DATE_TIME(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DATE_TIME(), DateTime.class, DATE_TIME.class, fldMap);
	}

}
