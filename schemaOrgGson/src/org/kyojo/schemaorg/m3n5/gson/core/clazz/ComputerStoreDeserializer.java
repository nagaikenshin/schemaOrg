package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COMPUTER_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ComputerStore;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ComputerStoreDeserializer implements JsonDeserializer<ComputerStore> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ComputerStore deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMPUTER_STORE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMPUTER_STORE(), ComputerStore.class, COMPUTER_STORE.class, fldMap);
	}

}
