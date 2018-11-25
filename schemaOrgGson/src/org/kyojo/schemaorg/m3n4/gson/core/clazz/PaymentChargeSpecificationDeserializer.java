package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PAYMENT_CHARGE_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentChargeSpecification;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PaymentChargeSpecificationDeserializer implements JsonDeserializer<PaymentChargeSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaymentChargeSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAYMENT_CHARGE_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAYMENT_CHARGE_SPECIFICATION(), PaymentChargeSpecification.class, PAYMENT_CHARGE_SPECIFICATION.class, fldMap);
	}

}
