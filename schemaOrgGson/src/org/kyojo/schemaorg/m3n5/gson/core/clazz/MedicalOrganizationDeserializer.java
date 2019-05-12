package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MEDICAL_ORGANIZATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.MedicalOrganization;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MedicalOrganizationDeserializer implements JsonDeserializer<MedicalOrganization> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalOrganization deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_ORGANIZATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_ORGANIZATION(), MedicalOrganization.class, MEDICAL_ORGANIZATION.class, fldMap);
	}

}
