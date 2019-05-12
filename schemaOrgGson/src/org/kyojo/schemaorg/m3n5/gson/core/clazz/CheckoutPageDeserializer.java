package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CHECKOUT_PAGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.CheckoutPage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CheckoutPageDeserializer implements JsonDeserializer<CheckoutPage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CheckoutPage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CHECKOUT_PAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CHECKOUT_PAGE(), CheckoutPage.class, CHECKOUT_PAGE.class, fldMap);
	}

}
