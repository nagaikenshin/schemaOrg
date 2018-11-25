package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PAYMENT_ACCEPTED;
import org.kyojo.schemaorg.m3n4.core.Container.PaymentAccepted;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PaymentAcceptedDeserializer implements JsonDeserializer<PaymentAccepted> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaymentAccepted deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAYMENT_ACCEPTED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAYMENT_ACCEPTED(), PaymentAccepted.class, PAYMENT_ACCEPTED.class, fldMap);
	}

}
