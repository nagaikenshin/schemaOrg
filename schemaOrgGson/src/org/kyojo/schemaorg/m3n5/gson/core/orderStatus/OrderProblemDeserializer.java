package org.kyojo.schemaorg.m3n5.gson.core.orderStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.orderStatus.ORDER_PROBLEM;
import org.kyojo.schemaorg.m3n5.core.OrderStatus.OrderProblem;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OrderProblemDeserializer implements JsonDeserializer<OrderProblem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OrderProblem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORDER_PROBLEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORDER_PROBLEM(), OrderProblem.class, ORDER_PROBLEM.class, fldMap);
	}

}
