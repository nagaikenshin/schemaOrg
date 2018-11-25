package org.kyojo.schemaorg.m3n4.gson.core.itemAvailability;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.itemAvailability.OUT_OF_STOCK;
import org.kyojo.schemaorg.m3n4.core.ItemAvailability.OutOfStock;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OutOfStockDeserializer implements JsonDeserializer<OutOfStock> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OutOfStock deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OUT_OF_STOCK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OUT_OF_STOCK(), OutOfStock.class, OUT_OF_STOCK.class, fldMap);
	}

}
