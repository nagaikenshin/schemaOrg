package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PARENT_ORGANIZATION;
import org.kyojo.schemaorg.m3n5.core.Container.ParentOrganization;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ParentOrganizationDeserializer implements JsonDeserializer<ParentOrganization> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ParentOrganization deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PARENT_ORGANIZATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PARENT_ORGANIZATION(), ParentOrganization.class, PARENT_ORGANIZATION.class, fldMap);
	}

}