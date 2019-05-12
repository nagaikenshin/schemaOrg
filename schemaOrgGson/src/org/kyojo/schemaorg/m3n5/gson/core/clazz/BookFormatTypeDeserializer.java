package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BOOK_FORMAT_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.BookFormatType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BookFormatTypeDeserializer implements JsonDeserializer<BookFormatType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BookFormatType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BOOK_FORMAT_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BOOK_FORMAT_TYPE(), BookFormatType.class, BOOK_FORMAT_TYPE.class, fldMap);
	}

}
