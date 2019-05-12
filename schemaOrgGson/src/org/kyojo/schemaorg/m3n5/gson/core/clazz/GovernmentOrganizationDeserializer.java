package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GOVERNMENT_ORGANIZATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.GovernmentOrganization;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GovernmentOrganizationDeserializer implements JsonDeserializer<GovernmentOrganization> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GovernmentOrganization deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GOVERNMENT_ORGANIZATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GOVERNMENT_ORGANIZATION(), GovernmentOrganization.class, GOVERNMENT_ORGANIZATION.class, fldMap);
	}

}
