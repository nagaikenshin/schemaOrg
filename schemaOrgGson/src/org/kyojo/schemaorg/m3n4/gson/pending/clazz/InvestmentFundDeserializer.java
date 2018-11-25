package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.INVESTMENT_FUND;
import org.kyojo.schemaorg.m3n4.pending.Clazz.InvestmentFund;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class InvestmentFundDeserializer implements JsonDeserializer<InvestmentFund> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InvestmentFund deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INVESTMENT_FUND(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INVESTMENT_FUND(), InvestmentFund.class, INVESTMENT_FUND.class, fldMap);
	}

}
