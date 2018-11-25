package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.THERAPEUTIC_PROCEDURE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.TherapeuticProcedure;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TherapeuticProcedureDeserializer implements JsonDeserializer<TherapeuticProcedure> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TherapeuticProcedure deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new THERAPEUTIC_PROCEDURE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new THERAPEUTIC_PROCEDURE(), TherapeuticProcedure.class, THERAPEUTIC_PROCEDURE.class, fldMap);
	}

}
