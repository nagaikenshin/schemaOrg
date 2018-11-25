package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.PLASTIC_SURGERY;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.PlasticSurgery;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PlasticSurgeryDeserializer implements JsonDeserializer<PlasticSurgery> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PlasticSurgery deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PLASTIC_SURGERY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PLASTIC_SURGERY(), PlasticSurgery.class, PLASTIC_SURGERY.class, fldMap);
	}

}
