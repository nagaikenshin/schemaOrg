package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.DAY_OF_WEEK;
import org.kyojo.schemaorg.m3n4.core.Clazz.DayOfWeek;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DayOfWeekDeserializer implements JsonDeserializer<DayOfWeek> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DayOfWeek deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DAY_OF_WEEK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DAY_OF_WEEK(), DayOfWeek.class, DAY_OF_WEEK.class, fldMap);
	}

}
