package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MESSAGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Message;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MessageDeserializer implements JsonDeserializer<Message> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Message deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MESSAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MESSAGE(), Message.class, MESSAGE.class, fldMap);
	}

}