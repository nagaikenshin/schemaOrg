package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ANSWER_COUNT;
import org.kyojo.schemaorg.m3n5.core.Container.AnswerCount;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AnswerCountDeserializer implements JsonDeserializer<AnswerCount> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AnswerCount deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new ANSWER_COUNT(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ANSWER_COUNT(), AnswerCount.class, ANSWER_COUNT.class, fldMap);
	}

}
