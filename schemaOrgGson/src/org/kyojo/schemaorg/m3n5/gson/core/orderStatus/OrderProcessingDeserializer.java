package org.kyojo.schemaorg.m3n5.gson.core.orderStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.orderStatus.ORDER_PROCESSING;
import org.kyojo.schemaorg.m3n5.core.OrderStatus.OrderProcessing;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OrderProcessingDeserializer implements JsonDeserializer<OrderProcessing> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderProcessing deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORDER_PROCESSING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_PROCESSING(), OrderProcessing.class, ORDER_PROCESSING.class, fldMap);
	}

}
