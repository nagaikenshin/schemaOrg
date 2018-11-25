package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CIVIC_STRUCTURE;
import org.kyojo.schemaorg.m3n4.core.Clazz.CivicStructure;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CivicStructureDeserializer implements JsonDeserializer<CivicStructure> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CivicStructure deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CIVIC_STRUCTURE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CIVIC_STRUCTURE(), CivicStructure.class, CIVIC_STRUCTURE.class, fldMap);
	}

}
