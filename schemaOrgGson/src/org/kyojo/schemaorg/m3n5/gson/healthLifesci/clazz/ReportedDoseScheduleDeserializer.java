package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.REPORTED_DOSE_SCHEDULE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.ReportedDoseSchedule;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReportedDoseScheduleDeserializer implements JsonDeserializer<ReportedDoseSchedule> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReportedDoseSchedule deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REPORTED_DOSE_SCHEDULE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REPORTED_DOSE_SCHEDULE(), ReportedDoseSchedule.class, REPORTED_DOSE_SCHEDULE.class, fldMap);
	}

}
