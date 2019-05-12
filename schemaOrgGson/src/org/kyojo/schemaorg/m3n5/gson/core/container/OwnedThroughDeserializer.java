package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.OWNED_THROUGH;
import org.kyojo.schemaorg.m3n5.core.Container.OwnedThrough;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OwnedThroughDeserializer implements JsonDeserializer<OwnedThrough> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OwnedThrough deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new OWNED_THROUGH(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OWNED_THROUGH(), OwnedThrough.class, OWNED_THROUGH.class, fldMap);
	}

}
