package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.DENTISTRY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Dentistry;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DentistryDeserializer implements JsonDeserializer<Dentistry> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Dentistry deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DENTISTRY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DENTISTRY(), Dentistry.class, DENTISTRY.class, fldMap);
	}

}
