package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.INVENTORY_LEVEL;
import org.kyojo.schemaorg.m3n5.core.Container.InventoryLevel;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class InventoryLevelDeserializer implements JsonDeserializer<InventoryLevel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InventoryLevel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INVENTORY_LEVEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INVENTORY_LEVEL(), InventoryLevel.class, INVENTORY_LEVEL.class, fldMap);
	}

}
