package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.NEXT_ITEM;
import org.kyojo.schemaorg.m3n5.core.Container.NextItem;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NextItemDeserializer implements JsonDeserializer<NextItem> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NextItem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NEXT_ITEM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NEXT_ITEM(), NextItem.class, NEXT_ITEM.class, fldMap);
	}

}
