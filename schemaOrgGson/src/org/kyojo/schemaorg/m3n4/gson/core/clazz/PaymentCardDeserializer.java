package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PAYMENT_CARD;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentCard;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PaymentCardDeserializer implements JsonDeserializer<PaymentCard> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaymentCard deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAYMENT_CARD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAYMENT_CARD(), PaymentCard.class, PAYMENT_CARD.class, fldMap);
	}

}
