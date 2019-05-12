package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.REPLACER;
import org.kyojo.schemaorg.m3n5.core.Container.Replacer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReplacerDeserializer implements JsonDeserializer<Replacer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Replacer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REPLACER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REPLACER(), Replacer.class, REPLACER.class, fldMap);
	}

}
