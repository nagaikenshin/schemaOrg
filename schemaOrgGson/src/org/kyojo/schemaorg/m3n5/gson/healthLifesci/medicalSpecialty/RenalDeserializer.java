package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.RENAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Renal;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RenalDeserializer implements JsonDeserializer<Renal> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Renal deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RENAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RENAL(), Renal.class, RENAL.class, fldMap);
	}

}
