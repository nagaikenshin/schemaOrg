package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.STADIUM_OR_ARENA;
import org.kyojo.schemaorg.m3n5.core.Clazz.StadiumOrArena;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class StadiumOrArenaDeserializer implements JsonDeserializer<StadiumOrArena> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StadiumOrArena deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STADIUM_OR_ARENA(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STADIUM_OR_ARENA(), StadiumOrArena.class, STADIUM_OR_ARENA.class, fldMap);
	}

}
