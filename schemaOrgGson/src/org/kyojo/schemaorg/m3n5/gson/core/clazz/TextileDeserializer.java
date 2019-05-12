package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TEXTILE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Textile;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TextileDeserializer implements JsonDeserializer<Textile> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Textile deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TEXTILE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TEXTILE(), Textile.class, TEXTILE.class, fldMap);
	}

}
