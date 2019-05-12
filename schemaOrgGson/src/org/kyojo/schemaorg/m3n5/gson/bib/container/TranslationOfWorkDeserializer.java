package org.kyojo.schemaorg.m3n5.gson.bib.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.bib.impl.TRANSLATION_OF_WORK;
import org.kyojo.schemaorg.m3n5.bib.Container.TranslationOfWork;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TranslationOfWorkDeserializer implements JsonDeserializer<TranslationOfWork> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TranslationOfWork deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRANSLATION_OF_WORK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRANSLATION_OF_WORK(), TranslationOfWork.class, TRANSLATION_OF_WORK.class, fldMap);
	}

}
