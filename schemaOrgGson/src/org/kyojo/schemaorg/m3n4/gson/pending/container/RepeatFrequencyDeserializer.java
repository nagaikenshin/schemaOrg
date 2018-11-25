package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.REPEAT_FREQUENCY;
import org.kyojo.schemaorg.m3n4.pending.Container.RepeatFrequency;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RepeatFrequencyDeserializer implements JsonDeserializer<RepeatFrequency> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RepeatFrequency deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REPEAT_FREQUENCY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REPEAT_FREQUENCY(), RepeatFrequency.class, REPEAT_FREQUENCY.class, fldMap);
	}

}
