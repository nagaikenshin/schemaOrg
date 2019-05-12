package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EMPLOYMENT_AGENCY;
import org.kyojo.schemaorg.m3n5.core.Clazz.EmploymentAgency;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EmploymentAgencyDeserializer implements JsonDeserializer<EmploymentAgency> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EmploymentAgency deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EMPLOYMENT_AGENCY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EMPLOYMENT_AGENCY(), EmploymentAgency.class, EMPLOYMENT_AGENCY.class, fldMap);
	}

}
