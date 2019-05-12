package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.ENGINE_DISPLACEMENT;
import org.kyojo.schemaorg.m3n5.auto.Container.EngineDisplacement;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EngineDisplacementDeserializer implements JsonDeserializer<EngineDisplacement> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EngineDisplacement deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ENGINE_DISPLACEMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ENGINE_DISPLACEMENT(), EngineDisplacement.class, ENGINE_DISPLACEMENT.class, fldMap);
	}

}
