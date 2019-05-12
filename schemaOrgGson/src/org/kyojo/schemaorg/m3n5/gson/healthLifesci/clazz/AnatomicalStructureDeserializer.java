package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.ANATOMICAL_STRUCTURE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.AnatomicalStructure;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AnatomicalStructureDeserializer implements JsonDeserializer<AnatomicalStructure> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AnatomicalStructure deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ANATOMICAL_STRUCTURE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ANATOMICAL_STRUCTURE(), AnatomicalStructure.class, ANATOMICAL_STRUCTURE.class, fldMap);
	}

}
