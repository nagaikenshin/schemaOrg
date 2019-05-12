package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PUBLIC_SWIMMING_POOL;
import org.kyojo.schemaorg.m3n5.core.Clazz.PublicSwimmingPool;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PublicSwimmingPoolDeserializer implements JsonDeserializer<PublicSwimmingPool> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PublicSwimmingPool deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PUBLIC_SWIMMING_POOL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PUBLIC_SWIMMING_POOL(), PublicSwimmingPool.class, PUBLIC_SWIMMING_POOL.class, fldMap);
	}

}
