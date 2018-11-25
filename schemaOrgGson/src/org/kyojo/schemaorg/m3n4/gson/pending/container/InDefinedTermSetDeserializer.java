package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.IN_DEFINED_TERM_SET;
import org.kyojo.schemaorg.m3n4.pending.Container.InDefinedTermSet;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class InDefinedTermSetDeserializer implements JsonDeserializer<InDefinedTermSet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InDefinedTermSet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IN_DEFINED_TERM_SET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IN_DEFINED_TERM_SET(), InDefinedTermSet.class, IN_DEFINED_TERM_SET.class, fldMap);
	}

}
