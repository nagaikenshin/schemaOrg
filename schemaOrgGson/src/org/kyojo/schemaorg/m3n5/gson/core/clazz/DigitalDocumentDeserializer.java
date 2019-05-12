package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DIGITAL_DOCUMENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.DigitalDocument;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DigitalDocumentDeserializer implements JsonDeserializer<DigitalDocument> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DigitalDocument deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIGITAL_DOCUMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIGITAL_DOCUMENT(), DigitalDocument.class, DIGITAL_DOCUMENT.class, fldMap);
	}

}
