package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MESSAGE_ATTACHMENT;
import org.kyojo.schemaorg.m3n5.core.Container.MessageAttachment;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MessageAttachmentDeserializer implements JsonDeserializer<MessageAttachment> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MessageAttachment deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MESSAGE_ATTACHMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MESSAGE_ATTACHMENT(), MessageAttachment.class, MESSAGE_ATTACHMENT.class, fldMap);
	}

}
