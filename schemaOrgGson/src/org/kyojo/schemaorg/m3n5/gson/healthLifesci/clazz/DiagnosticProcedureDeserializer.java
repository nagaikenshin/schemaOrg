package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DIAGNOSTIC_PROCEDURE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DiagnosticProcedure;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DiagnosticProcedureDeserializer implements JsonDeserializer<DiagnosticProcedure> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DiagnosticProcedure deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIAGNOSTIC_PROCEDURE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIAGNOSTIC_PROCEDURE(), DiagnosticProcedure.class, DIAGNOSTIC_PROCEDURE.class, fldMap);
	}

}
