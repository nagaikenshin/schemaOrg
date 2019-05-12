package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SUB_ORGANIZATION;
import org.kyojo.schemaorg.m3n5.core.Container.SubOrganization;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SubOrganizationDeserializer implements JsonDeserializer<SubOrganization> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SubOrganization deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUB_ORGANIZATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUB_ORGANIZATION(), SubOrganization.class, SUB_ORGANIZATION.class, fldMap);
	}

}