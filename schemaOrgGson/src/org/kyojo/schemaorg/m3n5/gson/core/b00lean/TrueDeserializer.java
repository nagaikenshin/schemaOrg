package org.kyojo.schemaorg.m3n5.gson.core.b00lean;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.b00lean.TRUE;
import org.kyojo.schemaorg.m3n5.core.B00lean.True;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TrueDeserializer implements JsonDeserializer<True> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public True deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRUE();
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRUE(), True.class, TRUE.class, fldMap);
	}

}
