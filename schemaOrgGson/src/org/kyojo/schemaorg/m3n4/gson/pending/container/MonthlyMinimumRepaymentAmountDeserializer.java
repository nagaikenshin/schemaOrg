package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.MONTHLY_MINIMUM_REPAYMENT_AMOUNT;
import org.kyojo.schemaorg.m3n4.pending.Container.MonthlyMinimumRepaymentAmount;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MonthlyMinimumRepaymentAmountDeserializer implements JsonDeserializer<MonthlyMinimumRepaymentAmount> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MonthlyMinimumRepaymentAmount deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MONTHLY_MINIMUM_REPAYMENT_AMOUNT(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MONTHLY_MINIMUM_REPAYMENT_AMOUNT(), MonthlyMinimumRepaymentAmount.class, MONTHLY_MINIMUM_REPAYMENT_AMOUNT.class, fldMap);
	}

}
