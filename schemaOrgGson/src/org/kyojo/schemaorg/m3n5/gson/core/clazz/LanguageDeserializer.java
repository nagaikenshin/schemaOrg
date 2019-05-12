package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LANGUAGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Language;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LanguageDeserializer implements JsonDeserializer<Language> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Language deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LANGUAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LANGUAGE(), Language.class, LANGUAGE.class, fldMap);
	}

}
