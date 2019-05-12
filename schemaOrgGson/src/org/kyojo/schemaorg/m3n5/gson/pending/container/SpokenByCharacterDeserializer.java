package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.SPOKEN_BY_CHARACTER;
import org.kyojo.schemaorg.m3n5.pending.Container.SpokenByCharacter;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SpokenByCharacterDeserializer implements JsonDeserializer<SpokenByCharacter> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SpokenByCharacter deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPOKEN_BY_CHARACTER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPOKEN_BY_CHARACTER(), SpokenByCharacter.class, SPOKEN_BY_CHARACTER.class, fldMap);
	}

}
