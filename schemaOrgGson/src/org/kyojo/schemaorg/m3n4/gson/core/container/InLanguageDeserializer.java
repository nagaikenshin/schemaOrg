package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.IN_LANGUAGE;
import org.kyojo.schemaorg.m3n4.core.Container.InLanguage;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class InLanguageDeserializer implements JsonDeserializer<InLanguage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InLanguage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IN_LANGUAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IN_LANGUAGE(), InLanguage.class, IN_LANGUAGE.class, fldMap);
	}

}
