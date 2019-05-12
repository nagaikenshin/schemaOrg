package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ORDER_ITEM_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.OrderItemNumber;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OrderItemNumberDeserializer implements JsonDeserializer<OrderItemNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderItemNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORDER_ITEM_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_ITEM_NUMBER(), OrderItemNumber.class, ORDER_ITEM_NUMBER.class, fldMap);
	}

}
