package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.COST_CURRENCY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.CostCurrency;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CostCurrencyDeserializer implements JsonDeserializer<CostCurrency> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CostCurrency deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COST_CURRENCY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COST_CURRENCY(), CostCurrency.class, COST_CURRENCY.class, fldMap);
	}

}
