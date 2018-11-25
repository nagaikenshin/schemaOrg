package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BASE_SALARY;
import org.kyojo.schemaorg.m3n4.core.Container.BaseSalary;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BaseSalaryDeserializer implements JsonDeserializer<BaseSalary> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BaseSalary deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BASE_SALARY(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BASE_SALARY(), BaseSalary.class, BASE_SALARY.class, fldMap);
	}

}
