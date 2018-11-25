package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalStudyStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalStudyStatus.TERMINATED;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalStudyStatus.Terminated;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TerminatedDeserializer implements JsonDeserializer<Terminated> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Terminated deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TERMINATED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TERMINATED(), Terminated.class, TERMINATED.class, fldMap);
	}

}
