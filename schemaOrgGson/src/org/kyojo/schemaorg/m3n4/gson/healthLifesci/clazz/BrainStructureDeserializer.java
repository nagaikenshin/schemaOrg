package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.BRAIN_STRUCTURE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.BrainStructure;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BrainStructureDeserializer implements JsonDeserializer<BrainStructure> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BrainStructure deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BRAIN_STRUCTURE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BRAIN_STRUCTURE(), BrainStructure.class, BRAIN_STRUCTURE.class, fldMap);
	}

}
