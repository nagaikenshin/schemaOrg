package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalStudyStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalStudyStatus.COMPLETED;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalStudyStatus.Completed;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CompletedDeserializer implements JsonDeserializer<Completed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Completed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMPLETED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMPLETED(), Completed.class, COMPLETED.class, fldMap);
	}

}
