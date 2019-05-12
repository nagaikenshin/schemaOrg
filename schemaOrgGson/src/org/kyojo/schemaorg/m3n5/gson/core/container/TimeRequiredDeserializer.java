package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TIME_REQUIRED;
import org.kyojo.schemaorg.m3n5.core.Container.TimeRequired;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TimeRequiredDeserializer implements JsonDeserializer<TimeRequired> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TimeRequired deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TIME_REQUIRED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TIME_REQUIRED(), TimeRequired.class, TIME_REQUIRED.class, fldMap);
	}

}
