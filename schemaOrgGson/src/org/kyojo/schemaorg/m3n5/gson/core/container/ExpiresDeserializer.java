package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EXPIRES;
import org.kyojo.schemaorg.m3n5.core.Container.Expires;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ExpiresDeserializer implements JsonDeserializer<Expires> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Expires deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new EXPIRES(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXPIRES(), Expires.class, EXPIRES.class, fldMap);
	}

}
