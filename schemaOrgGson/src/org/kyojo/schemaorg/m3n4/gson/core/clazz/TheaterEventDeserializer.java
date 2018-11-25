package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.THEATER_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.TheaterEvent;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TheaterEventDeserializer implements JsonDeserializer<TheaterEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TheaterEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new THEATER_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new THEATER_EVENT(), TheaterEvent.class, THEATER_EVENT.class, fldMap);
	}

}
