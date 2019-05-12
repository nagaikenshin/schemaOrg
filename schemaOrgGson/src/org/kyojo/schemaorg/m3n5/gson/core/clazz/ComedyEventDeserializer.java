package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COMEDY_EVENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.ComedyEvent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ComedyEventDeserializer implements JsonDeserializer<ComedyEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ComedyEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMEDY_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMEDY_EVENT(), ComedyEvent.class, COMEDY_EVENT.class, fldMap);
	}

}