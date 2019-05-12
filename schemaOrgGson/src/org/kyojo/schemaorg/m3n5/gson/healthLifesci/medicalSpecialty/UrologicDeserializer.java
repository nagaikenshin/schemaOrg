package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.UROLOGIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Urologic;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class UrologicDeserializer implements JsonDeserializer<Urologic> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Urologic deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new UROLOGIC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new UROLOGIC(), Urologic.class, UROLOGIC.class, fldMap);
	}

}
