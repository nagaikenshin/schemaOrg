package org.kyojo.schemaorg.m3n5.gson.bib.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.bib.impl.AUDIOBOOK;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Audiobook;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AudiobookDeserializer implements JsonDeserializer<Audiobook> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Audiobook deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AUDIOBOOK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AUDIOBOOK(), Audiobook.class, AUDIOBOOK.class, fldMap);
	}

}
