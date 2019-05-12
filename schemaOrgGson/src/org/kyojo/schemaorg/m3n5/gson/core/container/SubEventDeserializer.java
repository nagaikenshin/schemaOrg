package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SUB_EVENT;
import org.kyojo.schemaorg.m3n5.core.Container.SubEvent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SubEventDeserializer implements JsonDeserializer<SubEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SubEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUB_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUB_EVENT(), SubEvent.class, SUB_EVENT.class, fldMap);
	}

}
