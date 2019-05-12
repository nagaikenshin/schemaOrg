package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EMPLOYEE;
import org.kyojo.schemaorg.m3n5.core.Container.Employee;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EmployeeDeserializer implements JsonDeserializer<Employee> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Employee deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EMPLOYEE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EMPLOYEE(), Employee.class, EMPLOYEE.class, fldMap);
	}

}
