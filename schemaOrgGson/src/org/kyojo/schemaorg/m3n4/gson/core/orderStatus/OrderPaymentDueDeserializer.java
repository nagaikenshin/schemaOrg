package org.kyojo.schemaorg.m3n4.gson.core.orderStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.orderStatus.ORDER_PAYMENT_DUE;
import org.kyojo.schemaorg.m3n4.core.OrderStatus.OrderPaymentDue;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OrderPaymentDueDeserializer implements JsonDeserializer<OrderPaymentDue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderPaymentDue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORDER_PAYMENT_DUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_PAYMENT_DUE(), OrderPaymentDue.class, ORDER_PAYMENT_DUE.class, fldMap);
	}

}
