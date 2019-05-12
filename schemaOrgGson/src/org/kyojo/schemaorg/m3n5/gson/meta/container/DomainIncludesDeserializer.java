package org.kyojo.schemaorg.m3n5.gson.meta.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.meta.impl.DOMAIN_INCLUDES;
import org.kyojo.schemaorg.m3n5.meta.Container.DomainIncludes;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DomainIncludesDeserializer implements JsonDeserializer<DomainIncludes> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DomainIncludes deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DOMAIN_INCLUDES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DOMAIN_INCLUDES(), DomainIncludes.class, DOMAIN_INCLUDES.class, fldMap);
	}

}
