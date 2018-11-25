package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BILLING_ADDRESS;
import org.kyojo.schemaorg.m3n4.core.Container.BillingAddress;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BillingAddressDeserializer implements JsonDeserializer<BillingAddress> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BillingAddress deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BILLING_ADDRESS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BILLING_ADDRESS(), BillingAddress.class, BILLING_ADDRESS.class, fldMap);
	}

}
