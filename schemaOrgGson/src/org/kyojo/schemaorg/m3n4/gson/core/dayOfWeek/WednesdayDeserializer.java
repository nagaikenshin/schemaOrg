package org.kyojo.schemaorg.m3n4.gson.core.dayOfWeek;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.dayOfWeek.WEDNESDAY;
import org.kyojo.schemaorg.m3n4.core.DayOfWeek.Wednesday;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class WednesdayDeserializer implements JsonDeserializer<Wednesday> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Wednesday deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WEDNESDAY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WEDNESDAY(), Wednesday.class, WEDNESDAY.class, fldMap);
	}

}
