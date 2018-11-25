package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalDevicePurpose;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalDevicePurpose.DIAGNOSTIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalDevicePurpose.Diagnostic;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DiagnosticDeserializer implements JsonDeserializer<Diagnostic> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Diagnostic deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIAGNOSTIC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIAGNOSTIC(), Diagnostic.class, DIAGNOSTIC.class, fldMap);
	}

}
