package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ELECTRONICS_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ElectronicsStore;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ElectronicsStoreDeserializer implements JsonDeserializer<ElectronicsStore> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ElectronicsStore deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ELECTRONICS_STORE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ELECTRONICS_STORE(), ElectronicsStore.class, ELECTRONICS_STORE.class, fldMap);
	}

}
