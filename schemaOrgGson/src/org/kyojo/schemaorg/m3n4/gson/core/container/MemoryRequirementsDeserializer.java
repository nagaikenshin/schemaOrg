package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MEMORY_REQUIREMENTS;
import org.kyojo.schemaorg.m3n4.core.Container.MemoryRequirements;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MemoryRequirementsDeserializer implements JsonDeserializer<MemoryRequirements> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MemoryRequirements deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEMORY_REQUIREMENTS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEMORY_REQUIREMENTS(), MemoryRequirements.class, MEMORY_REQUIREMENTS.class, fldMap);
	}

}
