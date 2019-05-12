package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HOSTING_ORGANIZATION;
import org.kyojo.schemaorg.m3n5.core.Container.HostingOrganization;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HostingOrganizationDeserializer implements JsonDeserializer<HostingOrganization> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HostingOrganization deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HOSTING_ORGANIZATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HOSTING_ORGANIZATION(), HostingOrganization.class, HOSTING_ORGANIZATION.class, fldMap);
	}

}
