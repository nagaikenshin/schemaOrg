package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MENU_ITEM;
import org.kyojo.schemaorg.m3n4.core.Clazz.MenuItem;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MenuItemDeserializer implements JsonDeserializer<MenuItem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MenuItem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MENU_ITEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MENU_ITEM(), MenuItem.class, MENU_ITEM.class, fldMap);
	}

}
