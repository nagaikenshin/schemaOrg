package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_PAGES;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfPages;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NumberOfPagesDeserializer implements JsonDeserializer<NumberOfPages> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfPages deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new NUMBER_OF_PAGES(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_PAGES(), NumberOfPages.class, NUMBER_OF_PAGES.class, fldMap);
	}

}
