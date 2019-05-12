package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DANCE_EVENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.DanceEvent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DanceEventDeserializer implements JsonDeserializer<DanceEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DanceEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DANCE_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DANCE_EVENT(), DanceEvent.class, DANCE_EVENT.class, fldMap);
	}

}
