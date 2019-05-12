package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BIKE_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.BikeStore;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BikeStoreDeserializer implements JsonDeserializer<BikeStore> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BikeStore deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BIKE_STORE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BIKE_STORE(), BikeStore.class, BIKE_STORE.class, fldMap);
	}

}
