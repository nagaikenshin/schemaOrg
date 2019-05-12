package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.OPENING_HOURS;
import org.kyojo.schemaorg.m3n5.core.Container.OpeningHours;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OpeningHoursDeserializer implements JsonDeserializer<OpeningHours> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OpeningHours deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OPENING_HOURS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OPENING_HOURS(), OpeningHours.class, OPENING_HOURS.class, fldMap);
	}

}
