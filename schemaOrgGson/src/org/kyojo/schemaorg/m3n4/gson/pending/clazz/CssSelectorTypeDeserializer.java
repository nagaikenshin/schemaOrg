package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.CSS_SELECTOR_TYPE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CssSelectorType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CssSelectorTypeDeserializer implements JsonDeserializer<CssSelectorType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CssSelectorType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CSS_SELECTOR_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CSS_SELECTOR_TYPE(), CssSelectorType.class, CSS_SELECTOR_TYPE.class, fldMap);
	}

}
