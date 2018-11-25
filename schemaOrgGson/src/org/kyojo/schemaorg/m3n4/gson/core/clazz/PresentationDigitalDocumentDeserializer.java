package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PRESENTATION_DIGITAL_DOCUMENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.PresentationDigitalDocument;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PresentationDigitalDocumentDeserializer implements JsonDeserializer<PresentationDigitalDocument> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PresentationDigitalDocument deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRESENTATION_DIGITAL_DOCUMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRESENTATION_DIGITAL_DOCUMENT(), PresentationDigitalDocument.class, PRESENTATION_DIGITAL_DOCUMENT.class, fldMap);
	}

}
