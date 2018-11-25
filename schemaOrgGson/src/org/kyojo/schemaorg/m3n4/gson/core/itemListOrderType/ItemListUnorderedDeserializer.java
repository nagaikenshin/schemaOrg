package org.kyojo.schemaorg.m3n4.gson.core.itemListOrderType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.itemListOrderType.ITEM_LIST_UNORDERED;
import org.kyojo.schemaorg.m3n4.core.ItemListOrderType.ItemListUnordered;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ItemListUnorderedDeserializer implements JsonDeserializer<ItemListUnordered> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ItemListUnordered deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ITEM_LIST_UNORDERED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ITEM_LIST_UNORDERED(), ItemListUnordered.class, ITEM_LIST_UNORDERED.class, fldMap);
	}

}
