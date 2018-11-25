package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalStudyStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalStudyStatus.ACTIVE_NOT_RECRUITING;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalStudyStatus.ActiveNotRecruiting;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ActiveNotRecruitingDeserializer implements JsonDeserializer<ActiveNotRecruiting> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ActiveNotRecruiting deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACTIVE_NOT_RECRUITING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACTIVE_NOT_RECRUITING(), ActiveNotRecruiting.class, ACTIVE_NOT_RECRUITING.class, fldMap);
	}

}
