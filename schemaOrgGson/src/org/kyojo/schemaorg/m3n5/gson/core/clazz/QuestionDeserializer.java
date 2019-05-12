package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.QUESTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.Question;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class QuestionDeserializer implements JsonDeserializer<Question> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Question deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new QUESTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new QUESTION(), Question.class, QUESTION.class, fldMap);
	}

}
