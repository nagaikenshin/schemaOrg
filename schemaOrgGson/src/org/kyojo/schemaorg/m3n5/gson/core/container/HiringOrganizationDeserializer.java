package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HIRING_ORGANIZATION;
import org.kyojo.schemaorg.m3n5.core.Container.HiringOrganization;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HiringOrganizationDeserializer implements JsonDeserializer<HiringOrganization> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HiringOrganization deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HIRING_ORGANIZATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HIRING_ORGANIZATION(), HiringOrganization.class, HIRING_ORGANIZATION.class, fldMap);
	}

}