package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CANAL;
import org.kyojo.schemaorg.m3n4.core.Clazz.Canal;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CanalDeserializer implements JsonDeserializer<Canal> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Canal deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CANAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CANAL(), Canal.class, CANAL.class, fldMap);
	}

}
