package org.kyojo.schemaorg.m3n4.gson.core.itemListOrderType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.itemListOrderType.ITEM_LIST_ORDER_ASCENDING;
import org.kyojo.schemaorg.m3n4.core.ItemListOrderType.ItemListOrderAscending;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ItemListOrderAscendingDeserializer implements JsonDeserializer<ItemListOrderAscending> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ItemListOrderAscending deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ITEM_LIST_ORDER_ASCENDING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ITEM_LIST_ORDER_ASCENDING(), ItemListOrderAscending.class, ITEM_LIST_ORDER_ASCENDING.class, fldMap);
	}

}
