package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SOURCE_ORGANIZATION;
import org.kyojo.schemaorg.m3n4.core.Container.SourceOrganization;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SourceOrganizationDeserializer implements JsonDeserializer<SourceOrganization> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SourceOrganization deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SOURCE_ORGANIZATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SOURCE_ORGANIZATION(), SourceOrganization.class, SOURCE_ORGANIZATION.class, fldMap);
	}

}
