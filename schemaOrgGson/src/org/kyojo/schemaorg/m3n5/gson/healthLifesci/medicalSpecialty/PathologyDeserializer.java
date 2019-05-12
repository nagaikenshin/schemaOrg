package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.PATHOLOGY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Pathology;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PathologyDeserializer implements JsonDeserializer<Pathology> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Pathology deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PATHOLOGY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PATHOLOGY(), Pathology.class, PATHOLOGY.class, fldMap);
	}

}
