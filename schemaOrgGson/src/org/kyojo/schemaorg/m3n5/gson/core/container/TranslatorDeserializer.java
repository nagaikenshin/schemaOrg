package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TRANSLATOR;
import org.kyojo.schemaorg.m3n5.core.Container.Translator;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TranslatorDeserializer implements JsonDeserializer<Translator> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Translator deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRANSLATOR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRANSLATOR(), Translator.class, TRANSLATOR.class, fldMap);
	}

}
