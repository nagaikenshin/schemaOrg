package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CURRENCY_CONVERSION_SERVICE;
import org.kyojo.schemaorg.m3n5.core.Clazz.CurrencyConversionService;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CurrencyConversionServiceDeserializer implements JsonDeserializer<CurrencyConversionService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CurrencyConversionService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CURRENCY_CONVERSION_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CURRENCY_CONVERSION_SERVICE(), CurrencyConversionService.class, CURRENCY_CONVERSION_SERVICE.class, fldMap);
	}

}
