package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PAYMENT_STATUS;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentStatus;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PaymentStatusDeserializer implements JsonDeserializer<PaymentStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaymentStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAYMENT_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAYMENT_STATUS(), PaymentStatus.class, PAYMENT_STATUS.class, fldMap);
	}

}
