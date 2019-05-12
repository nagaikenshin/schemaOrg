package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FURNITURE_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.FurnitureStore;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FurnitureStoreDeserializer implements JsonDeserializer<FurnitureStore> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FurnitureStore deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FURNITURE_STORE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FURNITURE_STORE(), FurnitureStore.class, FURNITURE_STORE.class, fldMap);
	}

}
