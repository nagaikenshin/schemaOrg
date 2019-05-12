package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TEMPORAL;
import org.kyojo.schemaorg.m3n5.core.Container.Temporal;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TemporalDeserializer implements JsonDeserializer<Temporal> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Temporal deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TEMPORAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TEMPORAL(), Temporal.class, TEMPORAL.class, fldMap);
	}

}
