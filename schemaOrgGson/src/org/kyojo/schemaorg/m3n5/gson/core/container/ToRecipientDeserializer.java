package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TO_RECIPIENT;
import org.kyojo.schemaorg.m3n5.core.Container.ToRecipient;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ToRecipientDeserializer implements JsonDeserializer<ToRecipient> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ToRecipient deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TO_RECIPIENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TO_RECIPIENT(), ToRecipient.class, TO_RECIPIENT.class, fldMap);
	}

}
