package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ITEM_REVIEWED;
import org.kyojo.schemaorg.m3n4.core.Container.ItemReviewed;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ItemReviewedDeserializer implements JsonDeserializer<ItemReviewed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ItemReviewed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ITEM_REVIEWED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ITEM_REVIEWED(), ItemReviewed.class, ITEM_REVIEWED.class, fldMap);
	}

}
