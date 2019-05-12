package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EMAIL_MESSAGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.EmailMessage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EmailMessageDeserializer implements JsonDeserializer<EmailMessage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EmailMessage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EMAIL_MESSAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EMAIL_MESSAGE(), EmailMessage.class, EMAIL_MESSAGE.class, fldMap);
	}

}
