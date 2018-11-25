package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ORDER_ITEM_STATUS;
import org.kyojo.schemaorg.m3n4.core.Container.OrderItemStatus;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OrderItemStatusDeserializer implements JsonDeserializer<OrderItemStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderItemStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORDER_ITEM_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_ITEM_STATUS(), OrderItemStatus.class, ORDER_ITEM_STATUS.class, fldMap);
	}

}
