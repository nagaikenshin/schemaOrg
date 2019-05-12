package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SURGICAL_PROCEDURE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.SurgicalProcedure;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SurgicalProcedureDeserializer implements JsonDeserializer<SurgicalProcedure> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SurgicalProcedure deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SURGICAL_PROCEDURE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SURGICAL_PROCEDURE(), SurgicalProcedure.class, SURGICAL_PROCEDURE.class, fldMap);
	}

}