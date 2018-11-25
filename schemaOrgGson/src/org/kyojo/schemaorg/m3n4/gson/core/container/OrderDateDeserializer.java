package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ORDER_DATE;
import org.kyojo.schemaorg.m3n4.core.Container.OrderDate;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OrderDateDeserializer implements JsonDeserializer<OrderDate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new ORDER_DATE(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_DATE(), OrderDate.class, ORDER_DATE.class, fldMap);
	}

}
