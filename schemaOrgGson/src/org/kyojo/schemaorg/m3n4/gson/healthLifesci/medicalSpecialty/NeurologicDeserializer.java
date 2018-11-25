package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.NEUROLOGIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Neurologic;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NeurologicDeserializer implements JsonDeserializer<Neurologic> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Neurologic deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NEUROLOGIC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NEUROLOGIC(), Neurologic.class, NEUROLOGIC.class, fldMap);
	}

}
