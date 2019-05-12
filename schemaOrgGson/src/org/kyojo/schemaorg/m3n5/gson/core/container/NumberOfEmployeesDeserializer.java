package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.NUMBER_OF_EMPLOYEES;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfEmployees;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NumberOfEmployeesDeserializer implements JsonDeserializer<NumberOfEmployees> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfEmployees deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NUMBER_OF_EMPLOYEES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_EMPLOYEES(), NumberOfEmployees.class, NUMBER_OF_EMPLOYEES.class, fldMap);
	}

}
