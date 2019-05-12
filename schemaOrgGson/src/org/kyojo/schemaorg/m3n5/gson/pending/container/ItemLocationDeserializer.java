package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.ITEM_LOCATION;
import org.kyojo.schemaorg.m3n5.pending.Container.ItemLocation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ItemLocationDeserializer implements JsonDeserializer<ItemLocation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ItemLocation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ITEM_LOCATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ITEM_LOCATION(), ItemLocation.class, ITEM_LOCATION.class, fldMap);
	}

}
