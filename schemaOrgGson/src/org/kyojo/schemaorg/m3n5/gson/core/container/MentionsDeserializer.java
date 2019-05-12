package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MENTIONS;
import org.kyojo.schemaorg.m3n5.core.Container.Mentions;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MentionsDeserializer implements JsonDeserializer<Mentions> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Mentions deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MENTIONS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MENTIONS(), Mentions.class, MENTIONS.class, fldMap);
	}

}
