package org.kyojo.schemaorg.m3n5.gson.core.paymentStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.paymentStatusType.PAYMENT_COMPLETE;
import org.kyojo.schemaorg.m3n5.core.PaymentStatusType.PaymentComplete;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PaymentCompleteDeserializer implements JsonDeserializer<PaymentComplete> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaymentComplete deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAYMENT_COMPLETE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAYMENT_COMPLETE(), PaymentComplete.class, PAYMENT_COMPLETE.class, fldMap);
	}

}
