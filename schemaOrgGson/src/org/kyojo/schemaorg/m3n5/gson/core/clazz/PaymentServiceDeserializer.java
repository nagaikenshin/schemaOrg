package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PAYMENT_SERVICE;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentService;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PaymentServiceDeserializer implements JsonDeserializer<PaymentService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaymentService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAYMENT_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAYMENT_SERVICE(), PaymentService.class, PAYMENT_SERVICE.class, fldMap);
	}

}