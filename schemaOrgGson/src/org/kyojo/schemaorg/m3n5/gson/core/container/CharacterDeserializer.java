package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CHARACTER;
import org.kyojo.schemaorg.m3n5.core.Container.Character;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CharacterDeserializer implements JsonDeserializer<Character> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Character deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CHARACTER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CHARACTER(), Character.class, CHARACTER.class, fldMap);
	}

}
