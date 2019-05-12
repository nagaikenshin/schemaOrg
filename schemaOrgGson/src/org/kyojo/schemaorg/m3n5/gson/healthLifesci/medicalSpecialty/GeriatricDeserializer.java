package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.GERIATRIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Geriatric;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GeriatricDeserializer implements JsonDeserializer<Geriatric> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Geriatric deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GERIATRIC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GERIATRIC(), Geriatric.class, GERIATRIC.class, fldMap);
	}

}