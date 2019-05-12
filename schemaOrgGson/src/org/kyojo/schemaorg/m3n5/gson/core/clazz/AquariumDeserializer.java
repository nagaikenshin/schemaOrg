package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.AQUARIUM;
import org.kyojo.schemaorg.m3n5.core.Clazz.Aquarium;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AquariumDeserializer implements JsonDeserializer<Aquarium> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Aquarium deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AQUARIUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AQUARIUM(), Aquarium.class, AQUARIUM.class, fldMap);
	}

}
