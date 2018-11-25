package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BOOK_FORMAT;
import org.kyojo.schemaorg.m3n4.core.Container.BookFormat;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BookFormatDeserializer implements JsonDeserializer<BookFormat> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BookFormat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BOOK_FORMAT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BOOK_FORMAT(), BookFormat.class, BOOK_FORMAT.class, fldMap);
	}

}
