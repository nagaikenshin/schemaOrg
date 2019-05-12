package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.OPERATING_SYSTEM;
import org.kyojo.schemaorg.m3n5.core.Container.OperatingSystem;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OperatingSystemDeserializer implements JsonDeserializer<OperatingSystem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OperatingSystem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OPERATING_SYSTEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OPERATING_SYSTEM(), OperatingSystem.class, OPERATING_SYSTEM.class, fldMap);
	}

}