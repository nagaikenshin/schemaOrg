package org.kyojo.schemaorg.m3n5.gson.core.orderStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.orderStatus.ORDER_RETURNED;
import org.kyojo.schemaorg.m3n5.core.OrderStatus.OrderReturned;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OrderReturnedDeserializer implements JsonDeserializer<OrderReturned> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderReturned deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORDER_RETURNED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_RETURNED(), OrderReturned.class, ORDER_RETURNED.class, fldMap);
	}

}
