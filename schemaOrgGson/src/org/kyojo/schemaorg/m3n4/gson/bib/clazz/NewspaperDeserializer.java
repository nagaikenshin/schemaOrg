package org.kyojo.schemaorg.m3n4.gson.bib.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.bib.impl.NEWSPAPER;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Newspaper;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NewspaperDeserializer implements JsonDeserializer<Newspaper> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Newspaper deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NEWSPAPER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NEWSPAPER(), Newspaper.class, NEWSPAPER.class, fldMap);
	}

}
