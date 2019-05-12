package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SODIUM_CONTENT;
import org.kyojo.schemaorg.m3n5.core.Container.SodiumContent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SodiumContentDeserializer implements JsonDeserializer<SodiumContent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SodiumContent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SODIUM_CONTENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SODIUM_CONTENT(), SodiumContent.class, SODIUM_CONTENT.class, fldMap);
	}

}
