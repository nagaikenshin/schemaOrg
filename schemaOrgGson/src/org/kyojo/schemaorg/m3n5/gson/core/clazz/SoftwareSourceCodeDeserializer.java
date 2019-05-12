package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SOFTWARE_SOURCE_CODE;
import org.kyojo.schemaorg.m3n5.core.Clazz.SoftwareSourceCode;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SoftwareSourceCodeDeserializer implements JsonDeserializer<SoftwareSourceCode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SoftwareSourceCode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SOFTWARE_SOURCE_CODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SOFTWARE_SOURCE_CODE(), SoftwareSourceCode.class, SOFTWARE_SOURCE_CODE.class, fldMap);
	}

}
