package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.PULMONARY;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Pulmonary;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PulmonaryDeserializer implements JsonDeserializer<Pulmonary> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Pulmonary deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PULMONARY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PULMONARY(), Pulmonary.class, PULMONARY.class, fldMap);
	}

}
