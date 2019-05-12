package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.ENGINE_POWER;
import org.kyojo.schemaorg.m3n5.auto.Container.EnginePower;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EnginePowerDeserializer implements JsonDeserializer<EnginePower> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EnginePower deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ENGINE_POWER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ENGINE_POWER(), EnginePower.class, ENGINE_POWER.class, fldMap);
	}

}
