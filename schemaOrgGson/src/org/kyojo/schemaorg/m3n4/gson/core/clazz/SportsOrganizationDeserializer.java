package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SPORTS_ORGANIZATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsOrganization;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SportsOrganizationDeserializer implements JsonDeserializer<SportsOrganization> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SportsOrganization deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPORTS_ORGANIZATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPORTS_ORGANIZATION(), SportsOrganization.class, SPORTS_ORGANIZATION.class, fldMap);
	}

}
