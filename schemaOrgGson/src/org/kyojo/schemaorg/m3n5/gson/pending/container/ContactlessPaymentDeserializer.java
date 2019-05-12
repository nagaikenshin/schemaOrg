package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.CONTACTLESS_PAYMENT;
import org.kyojo.schemaorg.m3n5.pending.Container.ContactlessPayment;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ContactlessPaymentDeserializer implements JsonDeserializer<ContactlessPayment> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ContactlessPayment deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONTACTLESS_PAYMENT(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTACTLESS_PAYMENT(), ContactlessPayment.class, CONTACTLESS_PAYMENT.class, fldMap);
	}

}
