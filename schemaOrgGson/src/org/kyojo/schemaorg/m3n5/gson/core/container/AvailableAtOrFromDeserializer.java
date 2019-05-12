package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.AVAILABLE_AT_OR_FROM;
import org.kyojo.schemaorg.m3n5.core.Container.AvailableAtOrFrom;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AvailableAtOrFromDeserializer implements JsonDeserializer<AvailableAtOrFrom> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AvailableAtOrFrom deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AVAILABLE_AT_OR_FROM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AVAILABLE_AT_OR_FROM(), AvailableAtOrFrom.class, AVAILABLE_AT_OR_FROM.class, fldMap);
	}

}
