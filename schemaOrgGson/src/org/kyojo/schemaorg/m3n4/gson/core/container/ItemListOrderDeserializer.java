package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ITEM_LIST_ORDER;
import org.kyojo.schemaorg.m3n4.core.Container.ItemListOrder;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ItemListOrderDeserializer implements JsonDeserializer<ItemListOrder> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ItemListOrder deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ITEM_LIST_ORDER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ITEM_LIST_ORDER(), ItemListOrder.class, ITEM_LIST_ORDER.class, fldMap);
	}

}
