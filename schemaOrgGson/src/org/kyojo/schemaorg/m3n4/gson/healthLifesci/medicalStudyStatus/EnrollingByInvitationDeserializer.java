package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalStudyStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalStudyStatus.ENROLLING_BY_INVITATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalStudyStatus.EnrollingByInvitation;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EnrollingByInvitationDeserializer implements JsonDeserializer<EnrollingByInvitation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EnrollingByInvitation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ENROLLING_BY_INVITATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ENROLLING_BY_INVITATION(), EnrollingByInvitation.class, ENROLLING_BY_INVITATION.class, fldMap);
	}

}
