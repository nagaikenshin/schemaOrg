package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.COLLECTION_SIZE;
import org.kyojo.schemaorg.m3n5.pending.Container.CollectionSize;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CollectionSizeDeserializer implements JsonDeserializer<CollectionSize> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CollectionSize deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new COLLECTION_SIZE(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COLLECTION_SIZE(), CollectionSize.class, COLLECTION_SIZE.class, fldMap);
	}

}
