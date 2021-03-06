package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.ENGINE_TYPE;
import org.kyojo.schemaorg.m3n5.auto.Container.EngineType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EngineTypeDeserializer implements JsonDeserializer<EngineType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EngineType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ENGINE_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ENGINE_TYPE(), EngineType.class, ENGINE_TYPE.class, fldMap);
	}

}
