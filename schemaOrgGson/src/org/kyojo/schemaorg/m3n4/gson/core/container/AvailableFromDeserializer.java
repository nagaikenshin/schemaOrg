package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.AVAILABLE_FROM;
import org.kyojo.schemaorg.m3n4.core.Container.AvailableFrom;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AvailableFromDeserializer implements JsonDeserializer<AvailableFrom> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AvailableFrom deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new AVAILABLE_FROM(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AVAILABLE_FROM(), AvailableFrom.class, AVAILABLE_FROM.class, fldMap);
	}

}
