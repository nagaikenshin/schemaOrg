package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CSS_SELECTOR;
import org.kyojo.schemaorg.m3n5.core.Container.CssSelector;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CssSelectorDeserializer implements JsonDeserializer<CssSelector> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CssSelector deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CSS_SELECTOR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CSS_SELECTOR(), CssSelector.class, CSS_SELECTOR.class, fldMap);
	}

}
