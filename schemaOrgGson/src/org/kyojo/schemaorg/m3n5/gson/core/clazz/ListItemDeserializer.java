package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LIST_ITEM;
import org.kyojo.schemaorg.m3n5.core.Clazz.ListItem;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ListItemDeserializer implements JsonDeserializer<ListItem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ListItem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LIST_ITEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LIST_ITEM(), ListItem.class, LIST_ITEM.class, fldMap);
	}

}
