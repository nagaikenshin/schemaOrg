package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SPREADSHEET_DIGITAL_DOCUMENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.SpreadsheetDigitalDocument;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SpreadsheetDigitalDocumentDeserializer implements JsonDeserializer<SpreadsheetDigitalDocument> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SpreadsheetDigitalDocument deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPREADSHEET_DIGITAL_DOCUMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPREADSHEET_DIGITAL_DOCUMENT(), SpreadsheetDigitalDocument.class, SPREADSHEET_DIGITAL_DOCUMENT.class, fldMap);
	}

}
