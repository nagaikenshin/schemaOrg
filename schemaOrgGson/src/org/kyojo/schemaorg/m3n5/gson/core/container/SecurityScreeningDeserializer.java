package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SECURITY_SCREENING;
import org.kyojo.schemaorg.m3n5.core.Container.SecurityScreening;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SecurityScreeningDeserializer implements JsonDeserializer<SecurityScreening> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SecurityScreening deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SECURITY_SCREENING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SECURITY_SCREENING(), SecurityScreening.class, SECURITY_SCREENING.class, fldMap);
	}

}
