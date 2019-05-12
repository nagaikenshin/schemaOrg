package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalProcedureType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalProcedureType.NONINVASIVE_PROCEDURE;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalProcedureType.NoninvasiveProcedure;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NoninvasiveProcedureDeserializer implements JsonDeserializer<NoninvasiveProcedure> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NoninvasiveProcedure deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NONINVASIVE_PROCEDURE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NONINVASIVE_PROCEDURE(), NoninvasiveProcedure.class, NONINVASIVE_PROCEDURE.class, fldMap);
	}

}
