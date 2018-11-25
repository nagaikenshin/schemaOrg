package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.SCHEDULE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Schedule;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ScheduleDeserializer implements JsonDeserializer<Schedule> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Schedule deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SCHEDULE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SCHEDULE(), Schedule.class, SCHEDULE.class, fldMap);
	}

}
