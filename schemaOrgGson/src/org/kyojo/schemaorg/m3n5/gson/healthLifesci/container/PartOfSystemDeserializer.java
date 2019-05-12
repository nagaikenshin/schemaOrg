package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PART_OF_SYSTEM;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.PartOfSystem;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PartOfSystemDeserializer implements JsonDeserializer<PartOfSystem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PartOfSystem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PART_OF_SYSTEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PART_OF_SYSTEM(), PartOfSystem.class, PART_OF_SYSTEM.class, fldMap);
	}

}
