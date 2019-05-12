package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COUNTRIES_SUPPORTED;
import org.kyojo.schemaorg.m3n5.core.Container.CountriesSupported;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CountriesSupportedDeserializer implements JsonDeserializer<CountriesSupported> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CountriesSupported deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COUNTRIES_SUPPORTED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COUNTRIES_SUPPORTED(), CountriesSupported.class, COUNTRIES_SUPPORTED.class, fldMap);
	}

}
