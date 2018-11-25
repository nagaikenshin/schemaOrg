package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PROCEDURE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Procedure;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ProcedureDeserializer implements JsonDeserializer<Procedure> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Procedure deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROCEDURE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROCEDURE(), Procedure.class, PROCEDURE.class, fldMap);
	}

}
