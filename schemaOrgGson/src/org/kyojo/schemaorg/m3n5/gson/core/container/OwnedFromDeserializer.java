package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.OWNED_FROM;
import org.kyojo.schemaorg.m3n5.core.Container.OwnedFrom;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OwnedFromDeserializer implements JsonDeserializer<OwnedFrom> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OwnedFrom deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new OWNED_FROM(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OWNED_FROM(), OwnedFrom.class, OWNED_FROM.class, fldMap);
	}

}
