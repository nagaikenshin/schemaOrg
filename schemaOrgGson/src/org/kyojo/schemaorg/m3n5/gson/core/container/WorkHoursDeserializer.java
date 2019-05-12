package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.WORK_HOURS;
import org.kyojo.schemaorg.m3n5.core.Container.WorkHours;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WorkHoursDeserializer implements JsonDeserializer<WorkHours> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WorkHours deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WORK_HOURS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WORK_HOURS(), WorkHours.class, WORK_HOURS.class, fldMap);
	}

}
