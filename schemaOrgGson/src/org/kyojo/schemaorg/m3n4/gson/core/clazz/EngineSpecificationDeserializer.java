package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ENGINE_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.EngineSpecification;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EngineSpecificationDeserializer implements JsonDeserializer<EngineSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EngineSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ENGINE_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ENGINE_SPECIFICATION(), EngineSpecification.class, ENGINE_SPECIFICATION.class, fldMap);
	}

}
