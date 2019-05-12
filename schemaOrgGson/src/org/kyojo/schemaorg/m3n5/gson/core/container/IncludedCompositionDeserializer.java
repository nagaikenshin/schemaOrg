package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.INCLUDED_COMPOSITION;
import org.kyojo.schemaorg.m3n5.core.Container.IncludedComposition;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class IncludedCompositionDeserializer implements JsonDeserializer<IncludedComposition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IncludedComposition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INCLUDED_COMPOSITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INCLUDED_COMPOSITION(), IncludedComposition.class, INCLUDED_COMPOSITION.class, fldMap);
	}

}
