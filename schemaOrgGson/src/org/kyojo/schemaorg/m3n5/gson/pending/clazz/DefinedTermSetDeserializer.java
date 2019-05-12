package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.DEFINED_TERM_SET;
import org.kyojo.schemaorg.m3n5.pending.Clazz.DefinedTermSet;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DefinedTermSetDeserializer implements JsonDeserializer<DefinedTermSet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DefinedTermSet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DEFINED_TERM_SET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DEFINED_TERM_SET(), DefinedTermSet.class, DEFINED_TERM_SET.class, fldMap);
	}

}
