package org.kyojo.schemaorg.m3n5.gson.core.orderStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.orderStatus.ORDER_DELIVERED;
import org.kyojo.schemaorg.m3n5.core.OrderStatus.OrderDelivered;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OrderDeliveredDeserializer implements JsonDeserializer<OrderDelivered> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderDelivered deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORDER_DELIVERED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_DELIVERED(), OrderDelivered.class, ORDER_DELIVERED.class, fldMap);
	}

}
