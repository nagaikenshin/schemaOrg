package org.kyojo.schemaorg.m3n5.gson.core.dataType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DATE;
import org.kyojo.schemaorg.m3n5.core.DataType.Date;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DateDeserializer implements JsonDeserializer<Date> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new DATE(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DATE(), Date.class, DATE.class, fldMap);
	}

}
