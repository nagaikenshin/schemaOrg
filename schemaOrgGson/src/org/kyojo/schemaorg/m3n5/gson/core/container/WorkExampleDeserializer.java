package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.WORK_EXAMPLE;
import org.kyojo.schemaorg.m3n5.core.Container.WorkExample;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WorkExampleDeserializer implements JsonDeserializer<WorkExample> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WorkExample deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WORK_EXAMPLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WORK_EXAMPLE(), WorkExample.class, WORK_EXAMPLE.class, fldMap);
	}

}
