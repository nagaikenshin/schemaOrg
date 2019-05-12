package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SPEAKABLE;
import org.kyojo.schemaorg.m3n5.core.Container.Speakable;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SpeakableDeserializer implements JsonDeserializer<Speakable> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Speakable deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPEAKABLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPEAKABLE(), Speakable.class, SPEAKABLE.class, fldMap);
	}

}
