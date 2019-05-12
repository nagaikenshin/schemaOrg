package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MENU_ADD_ON;
import org.kyojo.schemaorg.m3n5.core.Container.MenuAddOn;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MenuAddOnDeserializer implements JsonDeserializer<MenuAddOn> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MenuAddOn deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MENU_ADD_ON(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MENU_ADD_ON(), MenuAddOn.class, MENU_ADD_ON.class, fldMap);
	}

}
