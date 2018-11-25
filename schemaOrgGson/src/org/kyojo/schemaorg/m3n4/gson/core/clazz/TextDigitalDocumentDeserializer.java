package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT_DIGITAL_DOCUMENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.TextDigitalDocument;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TextDigitalDocumentDeserializer implements JsonDeserializer<TextDigitalDocument> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TextDigitalDocument deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TEXT_DIGITAL_DOCUMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TEXT_DIGITAL_DOCUMENT(), TextDigitalDocument.class, TEXT_DIGITAL_DOCUMENT.class, fldMap);
	}

}
