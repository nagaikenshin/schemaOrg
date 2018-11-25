package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.HAS_DEFINED_TERM;
import org.kyojo.schemaorg.m3n4.pending.Container.HasDefinedTerm;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HasDefinedTermDeserializer implements JsonDeserializer<HasDefinedTerm> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HasDefinedTerm deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HAS_DEFINED_TERM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HAS_DEFINED_TERM(), HasDefinedTerm.class, HAS_DEFINED_TERM.class, fldMap);
	}

}
