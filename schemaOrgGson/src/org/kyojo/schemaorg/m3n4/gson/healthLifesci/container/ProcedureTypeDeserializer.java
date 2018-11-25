package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PROCEDURE_TYPE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ProcedureType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ProcedureTypeDeserializer implements JsonDeserializer<ProcedureType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProcedureType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROCEDURE_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROCEDURE_TYPE(), ProcedureType.class, PROCEDURE_TYPE.class, fldMap);
	}

}
