package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SCREENING_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.ScreeningEvent;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ScreeningEventDeserializer implements JsonDeserializer<ScreeningEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ScreeningEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SCREENING_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SCREENING_EVENT(), ScreeningEvent.class, SCREENING_EVENT.class, fldMap);
	}

}
