package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.LATEX;
import org.kyojo.schemaorg.m3n4.core.Container.LaTeX;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LaTeXDeserializer implements JsonDeserializer<LaTeX> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LaTeX deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LATEX(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LATEX(), LaTeX.class, LATEX.class, fldMap);
	}

}
