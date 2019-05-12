package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.INTEGER;
import org.kyojo.schemaorg.m3n5.core.Clazz.Integer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class IntegerDeserializer implements JsonDeserializer<Integer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Integer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new INTEGER(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INTEGER(), Integer.class, INTEGER.class, fldMap);
	}

}
