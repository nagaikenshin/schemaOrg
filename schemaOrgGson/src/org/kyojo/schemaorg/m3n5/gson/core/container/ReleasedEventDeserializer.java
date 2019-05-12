package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RELEASED_EVENT;
import org.kyojo.schemaorg.m3n5.core.Container.ReleasedEvent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReleasedEventDeserializer implements JsonDeserializer<ReleasedEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReleasedEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RELEASED_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RELEASED_EVENT(), ReleasedEvent.class, RELEASED_EVENT.class, fldMap);
	}

}
