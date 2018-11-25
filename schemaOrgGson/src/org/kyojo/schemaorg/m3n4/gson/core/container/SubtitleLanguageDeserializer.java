package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SUBTITLE_LANGUAGE;
import org.kyojo.schemaorg.m3n4.core.Container.SubtitleLanguage;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SubtitleLanguageDeserializer implements JsonDeserializer<SubtitleLanguage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SubtitleLanguage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUBTITLE_LANGUAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUBTITLE_LANGUAGE(), SubtitleLanguage.class, SUBTITLE_LANGUAGE.class, fldMap);
	}

}
