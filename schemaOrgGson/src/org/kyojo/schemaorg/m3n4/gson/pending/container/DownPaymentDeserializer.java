package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.DOWN_PAYMENT;
import org.kyojo.schemaorg.m3n4.pending.Container.DownPayment;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DownPaymentDeserializer implements JsonDeserializer<DownPayment> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DownPayment deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DOWN_PAYMENT(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DOWN_PAYMENT(), DownPayment.class, DOWN_PAYMENT.class, fldMap);
	}

}
