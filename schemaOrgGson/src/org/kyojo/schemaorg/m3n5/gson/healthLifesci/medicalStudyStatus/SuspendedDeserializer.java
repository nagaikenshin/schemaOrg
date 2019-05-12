package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalStudyStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalStudyStatus.SUSPENDED;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalStudyStatus.Suspended;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SuspendedDeserializer implements JsonDeserializer<Suspended> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Suspended deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUSPENDED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUSPENDED(), Suspended.class, SUSPENDED.class, fldMap);
	}

}
