package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.ANATOMICAL_SYSTEM;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.AnatomicalSystem;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AnatomicalSystemDeserializer implements JsonDeserializer<AnatomicalSystem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AnatomicalSystem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ANATOMICAL_SYSTEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ANATOMICAL_SYSTEM(), AnatomicalSystem.class, ANATOMICAL_SYSTEM.class, fldMap);
	}

}
