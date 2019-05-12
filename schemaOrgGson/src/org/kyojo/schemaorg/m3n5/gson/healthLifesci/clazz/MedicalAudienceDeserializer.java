package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_AUDIENCE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalAudience;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MedicalAudienceDeserializer implements JsonDeserializer<MedicalAudience> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalAudience deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_AUDIENCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_AUDIENCE(), MedicalAudience.class, MEDICAL_AUDIENCE.class, fldMap);
	}

}
