package org.kyojo.schemaorg.m3n4.gson.core.orderStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.orderStatus.ORDER_IN_TRANSIT;
import org.kyojo.schemaorg.m3n4.core.OrderStatus.OrderInTransit;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OrderInTransitDeserializer implements JsonDeserializer<OrderInTransit> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderInTransit deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORDER_IN_TRANSIT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_IN_TRANSIT(), OrderInTransit.class, ORDER_IN_TRANSIT.class, fldMap);
	}

}
