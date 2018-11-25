package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PROCESSOR_REQUIREMENTS;
import org.kyojo.schemaorg.m3n4.core.Container.ProcessorRequirements;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ProcessorRequirementsDeserializer implements JsonDeserializer<ProcessorRequirements> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProcessorRequirements deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROCESSOR_REQUIREMENTS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROCESSOR_REQUIREMENTS(), ProcessorRequirements.class, PROCESSOR_REQUIREMENTS.class, fldMap);
	}

}
