package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.DISCOUNT_CURRENCY;
import org.kyojo.schemaorg.m3n4.core.Container.DiscountCurrency;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DiscountCurrencyDeserializer implements JsonDeserializer<DiscountCurrency> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DiscountCurrency deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DISCOUNT_CURRENCY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DISCOUNT_CURRENCY(), DiscountCurrency.class, DISCOUNT_CURRENCY.class, fldMap);
	}

}
