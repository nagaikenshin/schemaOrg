package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PAYMENT_URL;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentUrl;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PaymentUrlDeserializer implements JsonDeserializer<PaymentUrl> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaymentUrl deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAYMENT_URL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAYMENT_URL(), PaymentUrl.class, PAYMENT_URL.class, fldMap);
	}

}
