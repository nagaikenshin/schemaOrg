package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.SURGICAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Surgical;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SurgicalDeserializer implements JsonDeserializer<Surgical> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Surgical deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SURGICAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SURGICAL(), Surgical.class, SURGICAL.class, fldMap);
	}

}
