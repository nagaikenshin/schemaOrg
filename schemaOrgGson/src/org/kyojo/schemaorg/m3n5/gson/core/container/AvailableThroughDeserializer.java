package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.AVAILABLE_THROUGH;
import org.kyojo.schemaorg.m3n5.core.Container.AvailableThrough;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AvailableThroughDeserializer implements JsonDeserializer<AvailableThrough> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AvailableThrough deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new AVAILABLE_THROUGH(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AVAILABLE_THROUGH(), AvailableThrough.class, AVAILABLE_THROUGH.class, fldMap);
	}

}
