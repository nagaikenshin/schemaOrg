package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EMPLOYEE_ROLE;
import org.kyojo.schemaorg.m3n5.core.Clazz.EmployeeRole;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EmployeeRoleDeserializer implements JsonDeserializer<EmployeeRole> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EmployeeRole deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EMPLOYEE_ROLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EMPLOYEE_ROLE(), EmployeeRole.class, EMPLOYEE_ROLE.class, fldMap);
	}

}
