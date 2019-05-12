package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HONORIFIC_PREFIX;
import org.kyojo.schemaorg.m3n5.core.Container.HonorificPrefix;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HonorificPrefixDeserializer implements JsonDeserializer<HonorificPrefix> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HonorificPrefix deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HONORIFIC_PREFIX(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HONORIFIC_PREFIX(), HonorificPrefix.class, HONORIFIC_PREFIX.class, fldMap);
	}

}
