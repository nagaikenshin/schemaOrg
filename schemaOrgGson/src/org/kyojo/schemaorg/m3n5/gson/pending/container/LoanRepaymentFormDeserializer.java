package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.LOAN_REPAYMENT_FORM;
import org.kyojo.schemaorg.m3n5.pending.Container.LoanRepaymentForm;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LoanRepaymentFormDeserializer implements JsonDeserializer<LoanRepaymentForm> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LoanRepaymentForm deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LOAN_REPAYMENT_FORM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LOAN_REPAYMENT_FORM(), LoanRepaymentForm.class, LOAN_REPAYMENT_FORM.class, fldMap);
	}

}
