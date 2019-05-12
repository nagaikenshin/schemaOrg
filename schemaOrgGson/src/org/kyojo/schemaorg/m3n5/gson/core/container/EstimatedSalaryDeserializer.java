package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ESTIMATED_SALARY;
import org.kyojo.schemaorg.m3n5.core.Container.EstimatedSalary;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EstimatedSalaryDeserializer implements JsonDeserializer<EstimatedSalary> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EstimatedSalary deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ESTIMATED_SALARY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ESTIMATED_SALARY(), EstimatedSalary.class, ESTIMATED_SALARY.class, fldMap);
	}

}
