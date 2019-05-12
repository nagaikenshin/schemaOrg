package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TOTAL_PAYMENT_DUE;
import org.kyojo.schemaorg.m3n5.core.Container.TotalPaymentDue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TotalPaymentDueDeserializer implements JsonDeserializer<TotalPaymentDue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TotalPaymentDue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TOTAL_PAYMENT_DUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TOTAL_PAYMENT_DUE(), TotalPaymentDue.class, TOTAL_PAYMENT_DUE.class, fldMap);
	}

}
