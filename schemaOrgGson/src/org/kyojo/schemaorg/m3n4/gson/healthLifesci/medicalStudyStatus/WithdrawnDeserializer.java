package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalStudyStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalStudyStatus.WITHDRAWN;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalStudyStatus.Withdrawn;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class WithdrawnDeserializer implements JsonDeserializer<Withdrawn> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Withdrawn deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WITHDRAWN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WITHDRAWN(), Withdrawn.class, WITHDRAWN.class, fldMap);
	}

}
