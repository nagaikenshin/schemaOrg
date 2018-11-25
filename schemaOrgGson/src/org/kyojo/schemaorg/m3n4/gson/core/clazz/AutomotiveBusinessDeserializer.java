package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.AUTOMOTIVE_BUSINESS;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutomotiveBusiness;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AutomotiveBusinessDeserializer implements JsonDeserializer<AutomotiveBusiness> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AutomotiveBusiness deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AUTOMOTIVE_BUSINESS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AUTOMOTIVE_BUSINESS(), AutomotiveBusiness.class, AUTOMOTIVE_BUSINESS.class, fldMap);
	}

}
