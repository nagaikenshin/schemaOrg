package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.INVESTMENT_OR_DEPOSIT;
import org.kyojo.schemaorg.m3n5.core.Clazz.InvestmentOrDeposit;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class InvestmentOrDepositDeserializer implements JsonDeserializer<InvestmentOrDeposit> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InvestmentOrDeposit deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INVESTMENT_OR_DEPOSIT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INVESTMENT_OR_DEPOSIT(), InvestmentOrDeposit.class, INVESTMENT_OR_DEPOSIT.class, fldMap);
	}

}
