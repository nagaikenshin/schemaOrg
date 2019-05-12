package org.kyojo.schemaorg.m3n5.gson.core.dayOfWeek;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.dayOfWeek.THURSDAY;
import org.kyojo.schemaorg.m3n5.core.DayOfWeek.Thursday;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ThursdayDeserializer implements JsonDeserializer<Thursday> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Thursday deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new THURSDAY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new THURSDAY(), Thursday.class, THURSDAY.class, fldMap);
	}

}
