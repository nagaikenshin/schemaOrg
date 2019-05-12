package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EDUCATIONAL_FRAMEWORK;
import org.kyojo.schemaorg.m3n5.core.Container.EducationalFramework;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EducationalFrameworkDeserializer implements JsonDeserializer<EducationalFramework> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EducationalFramework deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EDUCATIONAL_FRAMEWORK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EDUCATIONAL_FRAMEWORK(), EducationalFramework.class, EDUCATIONAL_FRAMEWORK.class, fldMap);
	}

}
