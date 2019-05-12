package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CURRENCIES_ACCEPTED;
import org.kyojo.schemaorg.m3n5.core.Container.CurrenciesAccepted;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CurrenciesAcceptedDeserializer implements JsonDeserializer<CurrenciesAccepted> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CurrenciesAccepted deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CURRENCIES_ACCEPTED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CURRENCIES_ACCEPTED(), CurrenciesAccepted.class, CURRENCIES_ACCEPTED.class, fldMap);
	}

}
