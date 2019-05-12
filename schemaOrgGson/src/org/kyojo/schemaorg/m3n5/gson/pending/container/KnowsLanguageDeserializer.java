package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.KNOWS_LANGUAGE;
import org.kyojo.schemaorg.m3n5.pending.Container.KnowsLanguage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class KnowsLanguageDeserializer implements JsonDeserializer<KnowsLanguage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public KnowsLanguage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new KNOWS_LANGUAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new KNOWS_LANGUAGE(), KnowsLanguage.class, KNOWS_LANGUAGE.class, fldMap);
	}

}
