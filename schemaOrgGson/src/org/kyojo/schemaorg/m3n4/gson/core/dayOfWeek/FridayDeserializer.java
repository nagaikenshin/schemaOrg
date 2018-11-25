package org.kyojo.schemaorg.m3n4.gson.core.dayOfWeek;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.dayOfWeek.FRIDAY;
import org.kyojo.schemaorg.m3n4.core.DayOfWeek.Friday;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FridayDeserializer implements JsonDeserializer<Friday> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Friday deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FRIDAY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FRIDAY(), Friday.class, FRIDAY.class, fldMap);
	}

}
