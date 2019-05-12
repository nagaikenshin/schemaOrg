package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.RECOMMENDED_DOSE_SCHEDULE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.RecommendedDoseSchedule;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RecommendedDoseScheduleDeserializer implements JsonDeserializer<RecommendedDoseSchedule> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecommendedDoseSchedule deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECOMMENDED_DOSE_SCHEDULE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECOMMENDED_DOSE_SCHEDULE(), RecommendedDoseSchedule.class, RECOMMENDED_DOSE_SCHEDULE.class, fldMap);
	}

}
