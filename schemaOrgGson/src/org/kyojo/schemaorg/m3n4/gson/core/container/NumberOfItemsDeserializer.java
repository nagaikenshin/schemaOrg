package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_ITEMS;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfItems;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NumberOfItemsDeserializer implements JsonDeserializer<NumberOfItems> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfItems deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new NUMBER_OF_ITEMS(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_ITEMS(), NumberOfItems.class, NUMBER_OF_ITEMS.class, fldMap);
	}

}
