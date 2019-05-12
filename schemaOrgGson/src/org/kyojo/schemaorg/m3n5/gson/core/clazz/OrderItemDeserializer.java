package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ORDER_ITEM;
import org.kyojo.schemaorg.m3n5.core.Clazz.OrderItem;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OrderItemDeserializer implements JsonDeserializer<OrderItem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderItem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORDER_ITEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_ITEM(), OrderItem.class, ORDER_ITEM.class, fldMap);
	}

}
