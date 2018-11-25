package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.COUNTRIES_NOT_SUPPORTED;
import org.kyojo.schemaorg.m3n4.core.Container.CountriesNotSupported;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CountriesNotSupportedDeserializer implements JsonDeserializer<CountriesNotSupported> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CountriesNotSupported deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COUNTRIES_NOT_SUPPORTED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COUNTRIES_NOT_SUPPORTED(), CountriesNotSupported.class, COUNTRIES_NOT_SUPPORTED.class, fldMap);
	}

}
