package org.kyojo.schemaorg.m3n4.gson.core.itemAvailability;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.itemAvailability.IN_STOCK;
import org.kyojo.schemaorg.m3n4.core.ItemAvailability.InStock;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class InStockDeserializer implements JsonDeserializer<InStock> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InStock deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IN_STOCK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IN_STOCK(), InStock.class, IN_STOCK.class, fldMap);
	}

}
