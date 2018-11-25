package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HONORIFIC_SUFFIX;
import org.kyojo.schemaorg.m3n4.core.Container.HonorificSuffix;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HonorificSuffixDeserializer implements JsonDeserializer<HonorificSuffix> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HonorificSuffix deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HONORIFIC_SUFFIX(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HONORIFIC_SUFFIX(), HonorificSuffix.class, HONORIFIC_SUFFIX.class, fldMap);
	}

}
