package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HOW_TO_ITEM;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToItem;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HowToItemDeserializer implements JsonDeserializer<HowToItem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HowToItem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HOW_TO_ITEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HOW_TO_ITEM(), HowToItem.class, HOW_TO_ITEM.class, fldMap);
	}

}
