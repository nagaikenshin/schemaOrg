package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SUGGESTED_MAX_AGE;
import org.kyojo.schemaorg.m3n4.core.Container.SuggestedMaxAge;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SuggestedMaxAgeDeserializer implements JsonDeserializer<SuggestedMaxAge> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SuggestedMaxAge deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUGGESTED_MAX_AGE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUGGESTED_MAX_AGE(), SuggestedMaxAge.class, SUGGESTED_MAX_AGE.class, fldMap);
	}

}
