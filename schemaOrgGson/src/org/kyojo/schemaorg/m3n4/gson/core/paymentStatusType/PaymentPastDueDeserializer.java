package org.kyojo.schemaorg.m3n4.gson.core.paymentStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.paymentStatusType.PAYMENT_PAST_DUE;
import org.kyojo.schemaorg.m3n4.core.PaymentStatusType.PaymentPastDue;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PaymentPastDueDeserializer implements JsonDeserializer<PaymentPastDue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaymentPastDue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAYMENT_PAST_DUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAYMENT_PAST_DUE(), PaymentPastDue.class, PAYMENT_PAST_DUE.class, fldMap);
	}

}
