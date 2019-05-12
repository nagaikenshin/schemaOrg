package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MUSICAL_KEY;
import org.kyojo.schemaorg.m3n5.core.Container.MusicalKey;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MusicalKeyDeserializer implements JsonDeserializer<MusicalKey> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MusicalKey deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MUSICAL_KEY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MUSICAL_KEY(), MusicalKey.class, MUSICAL_KEY.class, fldMap);
	}

}
