package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.PRIMARY_CARE;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.PrimaryCare;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PrimaryCareDeserializer implements JsonDeserializer<PrimaryCare> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PrimaryCare deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRIMARY_CARE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRIMARY_CARE(), PrimaryCare.class, PRIMARY_CARE.class, fldMap);
	}

}
