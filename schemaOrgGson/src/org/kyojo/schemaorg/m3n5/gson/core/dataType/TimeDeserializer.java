package org.kyojo.schemaorg.m3n5.gson.core.dataType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TIME;
import org.kyojo.schemaorg.m3n5.core.DataType.Time;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TimeDeserializer implements JsonDeserializer<Time> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Time deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalTime time = context.deserialize(jsonElement, java.time.LocalTime.class);
			return new TIME(time);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TIME(), Time.class, TIME.class, fldMap);
	}

}
