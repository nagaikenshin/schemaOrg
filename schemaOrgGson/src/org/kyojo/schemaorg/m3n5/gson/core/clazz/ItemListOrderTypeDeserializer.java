package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ITEM_LIST_ORDER_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ItemListOrderType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ItemListOrderTypeDeserializer implements JsonDeserializer<ItemListOrderType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ItemListOrderType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ITEM_LIST_ORDER_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ITEM_LIST_ORDER_TYPE(), ItemListOrderType.class, ITEM_LIST_ORDER_TYPE.class, fldMap);
	}

}
