package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TOY_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ToyStore;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ToyStoreDeserializer implements JsonDeserializer<ToyStore> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ToyStore deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TOY_STORE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TOY_STORE(), ToyStore.class, TOY_STORE.class, fldMap);
	}

}
