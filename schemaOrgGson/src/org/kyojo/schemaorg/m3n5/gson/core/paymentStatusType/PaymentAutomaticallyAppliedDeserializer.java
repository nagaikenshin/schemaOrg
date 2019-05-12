package org.kyojo.schemaorg.m3n5.gson.core.paymentStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.paymentStatusType.PAYMENT_AUTOMATICALLY_APPLIED;
import org.kyojo.schemaorg.m3n5.core.PaymentStatusType.PaymentAutomaticallyApplied;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PaymentAutomaticallyAppliedDeserializer implements JsonDeserializer<PaymentAutomaticallyApplied> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaymentAutomaticallyApplied deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAYMENT_AUTOMATICALLY_APPLIED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAYMENT_AUTOMATICALLY_APPLIED(), PaymentAutomaticallyApplied.class, PAYMENT_AUTOMATICALLY_APPLIED.class, fldMap);
	}

}
