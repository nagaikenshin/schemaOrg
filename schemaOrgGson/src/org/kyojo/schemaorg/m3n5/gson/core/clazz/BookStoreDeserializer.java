package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BOOK_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.BookStore;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BookStoreDeserializer implements JsonDeserializer<BookStore> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BookStore deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BOOK_STORE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BOOK_STORE(), BookStore.class, BOOK_STORE.class, fldMap);
	}

}
