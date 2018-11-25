package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DIAGNOSTIC_LAB;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DiagnosticLab;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DiagnosticLabDeserializer implements JsonDeserializer<DiagnosticLab> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DiagnosticLab deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIAGNOSTIC_LAB(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIAGNOSTIC_LAB(), DiagnosticLab.class, DIAGNOSTIC_LAB.class, fldMap);
	}

}
