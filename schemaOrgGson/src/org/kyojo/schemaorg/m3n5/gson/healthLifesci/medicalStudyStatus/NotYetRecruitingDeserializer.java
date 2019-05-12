package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalStudyStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalStudyStatus.NOT_YET_RECRUITING;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalStudyStatus.NotYetRecruiting;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NotYetRecruitingDeserializer implements JsonDeserializer<NotYetRecruiting> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NotYetRecruiting deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NOT_YET_RECRUITING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NOT_YET_RECRUITING(), NotYetRecruiting.class, NOT_YET_RECRUITING.class, fldMap);
	}

}
