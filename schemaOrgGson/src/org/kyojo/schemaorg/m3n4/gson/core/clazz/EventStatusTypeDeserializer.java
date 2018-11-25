package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.EVENT_STATUS_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.EventStatusType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EventStatusTypeDeserializer implements JsonDeserializer<EventStatusType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EventStatusType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EVENT_STATUS_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EVENT_STATUS_TYPE(), EventStatusType.class, EVENT_STATUS_TYPE.class, fldMap);
	}

}
