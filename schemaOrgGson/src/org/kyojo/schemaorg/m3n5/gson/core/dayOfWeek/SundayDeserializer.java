package org.kyojo.schemaorg.m3n5.gson.core.dayOfWeek;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.dayOfWeek.SUNDAY;
import org.kyojo.schemaorg.m3n5.core.DayOfWeek.Sunday;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SundayDeserializer implements JsonDeserializer<Sunday> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Sunday deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUNDAY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUNDAY(), Sunday.class, SUNDAY.class, fldMap);
	}

}
