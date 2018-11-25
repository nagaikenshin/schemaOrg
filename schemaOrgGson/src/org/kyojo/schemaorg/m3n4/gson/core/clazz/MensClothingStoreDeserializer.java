package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MENS_CLOTHING_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.MensClothingStore;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MensClothingStoreDeserializer implements JsonDeserializer<MensClothingStore> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MensClothingStore deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MENS_CLOTHING_STORE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MENS_CLOTHING_STORE(), MensClothingStore.class, MENS_CLOTHING_STORE.class, fldMap);
	}

}
