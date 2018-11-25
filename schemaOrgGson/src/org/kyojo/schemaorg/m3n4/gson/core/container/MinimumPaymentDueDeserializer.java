package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MINIMUM_PAYMENT_DUE;
import org.kyojo.schemaorg.m3n4.core.Container.MinimumPaymentDue;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MinimumPaymentDueDeserializer implements JsonDeserializer<MinimumPaymentDue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MinimumPaymentDue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MINIMUM_PAYMENT_DUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MINIMUM_PAYMENT_DUE(), MinimumPaymentDue.class, MINIMUM_PAYMENT_DUE.class, fldMap);
	}

}
