package org.kyojo.schemaorg.m3n5.gson.core.orderStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.orderStatus.ORDER_PICKUP_AVAILABLE;
import org.kyojo.schemaorg.m3n5.core.OrderStatus.OrderPickupAvailable;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OrderPickupAvailableDeserializer implements JsonDeserializer<OrderPickupAvailable> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderPickupAvailable deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORDER_PICKUP_AVAILABLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_PICKUP_AVAILABLE(), OrderPickupAvailable.class, ORDER_PICKUP_AVAILABLE.class, fldMap);
	}

}
