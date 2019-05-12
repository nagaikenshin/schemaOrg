package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ITEM_CONDITION;
import org.kyojo.schemaorg.m3n5.core.Container.ItemCondition;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ItemConditionDeserializer implements JsonDeserializer<ItemCondition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ItemCondition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ITEM_CONDITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ITEM_CONDITION(), ItemCondition.class, ITEM_CONDITION.class, fldMap);
	}

}
