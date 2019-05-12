package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.NUMBER_OF_LOAN_PAYMENTS;
import org.kyojo.schemaorg.m3n5.pending.Container.NumberOfLoanPayments;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NumberOfLoanPaymentsDeserializer implements JsonDeserializer<NumberOfLoanPayments> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfLoanPayments deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NUMBER_OF_LOAN_PAYMENTS(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_LOAN_PAYMENTS(), NumberOfLoanPayments.class, NUMBER_OF_LOAN_PAYMENTS.class, fldMap);
	}

}
