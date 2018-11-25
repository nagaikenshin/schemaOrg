package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.YIELD;
import org.kyojo.schemaorg.m3n4.core.Container.Yield;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class YieldDeserializer implements JsonDeserializer<Yield> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Yield deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new YIELD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new YIELD(), Yield.class, YIELD.class, fldMap);
	}

}
