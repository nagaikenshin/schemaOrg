package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ACCEPTED_PAYMENT_METHOD;
import org.kyojo.schemaorg.m3n5.core.Container.AcceptedPaymentMethod;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AcceptedPaymentMethodDeserializer implements JsonDeserializer<AcceptedPaymentMethod> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AcceptedPaymentMethod deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACCEPTED_PAYMENT_METHOD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACCEPTED_PAYMENT_METHOD(), AcceptedPaymentMethod.class, ACCEPTED_PAYMENT_METHOD.class, fldMap);
	}

}
