package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.CARDIOVASCULAR;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Cardiovascular;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CardiovascularDeserializer implements JsonDeserializer<Cardiovascular> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Cardiovascular deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CARDIOVASCULAR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CARDIOVASCULAR(), Cardiovascular.class, CARDIOVASCULAR.class, fldMap);
	}

}
