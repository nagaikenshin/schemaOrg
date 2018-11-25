package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.CODING_SYSTEM;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.CodingSystem;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CodingSystemDeserializer implements JsonDeserializer<CodingSystem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CodingSystem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CODING_SYSTEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CODING_SYSTEM(), CodingSystem.class, CODING_SYSTEM.class, fldMap);
	}

}
