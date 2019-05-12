package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CONVENIENCE_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ConvenienceStore;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ConvenienceStoreDeserializer implements JsonDeserializer<ConvenienceStore> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ConvenienceStore deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONVENIENCE_STORE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONVENIENCE_STORE(), ConvenienceStore.class, CONVENIENCE_STORE.class, fldMap);
	}

}
