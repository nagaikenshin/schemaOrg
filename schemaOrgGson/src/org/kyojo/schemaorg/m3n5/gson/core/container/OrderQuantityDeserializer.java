package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ORDER_QUANTITY;
import org.kyojo.schemaorg.m3n5.core.Container.OrderQuantity;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OrderQuantityDeserializer implements JsonDeserializer<OrderQuantity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderQuantity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORDER_QUANTITY(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_QUANTITY(), OrderQuantity.class, ORDER_QUANTITY.class, fldMap);
	}

}
