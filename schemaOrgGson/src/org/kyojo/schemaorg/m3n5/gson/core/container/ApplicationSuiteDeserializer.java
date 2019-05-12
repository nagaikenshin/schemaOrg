package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.APPLICATION_SUITE;
import org.kyojo.schemaorg.m3n5.core.Container.ApplicationSuite;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ApplicationSuiteDeserializer implements JsonDeserializer<ApplicationSuite> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ApplicationSuite deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new APPLICATION_SUITE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new APPLICATION_SUITE(), ApplicationSuite.class, APPLICATION_SUITE.class, fldMap);
	}

}
