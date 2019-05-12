package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SPORTS_EVENT;
import org.kyojo.schemaorg.m3n5.core.Container.SportsEvent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SportsEventDeserializer implements JsonDeserializer<SportsEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SportsEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPORTS_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPORTS_EVENT(), SportsEvent.class, SPORTS_EVENT.class, fldMap);
	}

}
