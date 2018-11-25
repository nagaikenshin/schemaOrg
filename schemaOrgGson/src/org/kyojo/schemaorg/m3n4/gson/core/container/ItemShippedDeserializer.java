package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ITEM_SHIPPED;
import org.kyojo.schemaorg.m3n4.core.Container.ItemShipped;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ItemShippedDeserializer implements JsonDeserializer<ItemShipped> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ItemShipped deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ITEM_SHIPPED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ITEM_SHIPPED(), ItemShipped.class, ITEM_SHIPPED.class, fldMap);
	}

}
