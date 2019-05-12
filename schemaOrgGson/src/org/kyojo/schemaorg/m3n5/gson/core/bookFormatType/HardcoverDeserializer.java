package org.kyojo.schemaorg.m3n5.gson.core.bookFormatType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.bookFormatType.HARDCOVER;
import org.kyojo.schemaorg.m3n5.core.BookFormatType.Hardcover;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HardcoverDeserializer implements JsonDeserializer<Hardcover> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Hardcover deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HARDCOVER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HARDCOVER(), Hardcover.class, HARDCOVER.class, fldMap);
	}

}
