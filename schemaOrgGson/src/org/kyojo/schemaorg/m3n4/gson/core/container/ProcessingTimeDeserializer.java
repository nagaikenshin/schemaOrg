package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PROCESSING_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.ProcessingTime;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ProcessingTimeDeserializer implements JsonDeserializer<ProcessingTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProcessingTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROCESSING_TIME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROCESSING_TIME(), ProcessingTime.class, PROCESSING_TIME.class, fldMap);
	}

}
