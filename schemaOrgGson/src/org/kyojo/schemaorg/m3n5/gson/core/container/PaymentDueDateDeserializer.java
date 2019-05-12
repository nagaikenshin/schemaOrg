package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PAYMENT_DUE_DATE;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentDueDate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PaymentDueDateDeserializer implements JsonDeserializer<PaymentDueDate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaymentDueDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new PAYMENT_DUE_DATE(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAYMENT_DUE_DATE(), PaymentDueDate.class, PAYMENT_DUE_DATE.class, fldMap);
	}

}
