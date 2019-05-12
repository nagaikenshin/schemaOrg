package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LOCAL_BUSINESS;
import org.kyojo.schemaorg.m3n5.core.Clazz.LocalBusiness;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LocalBusinessDeserializer implements JsonDeserializer<LocalBusiness> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LocalBusiness deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LOCAL_BUSINESS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LOCAL_BUSINESS(), LocalBusiness.class, LOCAL_BUSINESS.class, fldMap);
	}

}
