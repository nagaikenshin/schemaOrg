package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.COMPUTER_LANGUAGE;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComputerLanguage;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ComputerLanguageDeserializer implements JsonDeserializer<ComputerLanguage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ComputerLanguage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMPUTER_LANGUAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMPUTER_LANGUAGE(), ComputerLanguage.class, COMPUTER_LANGUAGE.class, fldMap);
	}

}
