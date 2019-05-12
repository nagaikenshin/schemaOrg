package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ITEM_OFFERED;
import org.kyojo.schemaorg.m3n5.core.Container.ItemOffered;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ItemOfferedDeserializer implements JsonDeserializer<ItemOffered> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ItemOffered deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ITEM_OFFERED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ITEM_OFFERED(), ItemOffered.class, ITEM_OFFERED.class, fldMap);
	}

}
