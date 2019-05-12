package org.kyojo.schemaorg.m3n5.gson.core.paymentStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.paymentStatusType.PAYMENT_DECLINED;
import org.kyojo.schemaorg.m3n5.core.PaymentStatusType.PaymentDeclined;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PaymentDeclinedDeserializer implements JsonDeserializer<PaymentDeclined> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaymentDeclined deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAYMENT_DECLINED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAYMENT_DECLINED(), PaymentDeclined.class, PAYMENT_DECLINED.class, fldMap);
	}

}
