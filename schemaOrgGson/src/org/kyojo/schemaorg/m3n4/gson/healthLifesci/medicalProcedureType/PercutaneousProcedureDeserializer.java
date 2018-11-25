package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalProcedureType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalProcedureType.PERCUTANEOUS_PROCEDURE;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalProcedureType.PercutaneousProcedure;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PercutaneousProcedureDeserializer implements JsonDeserializer<PercutaneousProcedure> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PercutaneousProcedure deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PERCUTANEOUS_PROCEDURE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PERCUTANEOUS_PROCEDURE(), PercutaneousProcedure.class, PERCUTANEOUS_PROCEDURE.class, fldMap);
	}

}
