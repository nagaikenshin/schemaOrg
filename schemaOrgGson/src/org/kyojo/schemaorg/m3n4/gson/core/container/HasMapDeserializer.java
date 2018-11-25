package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HAS_MAP;
import org.kyojo.schemaorg.m3n4.core.Container.HasMap;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HasMapDeserializer implements JsonDeserializer<HasMap> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HasMap deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HAS_MAP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HAS_MAP(), HasMap.class, HAS_MAP.class, fldMap);
	}

}
