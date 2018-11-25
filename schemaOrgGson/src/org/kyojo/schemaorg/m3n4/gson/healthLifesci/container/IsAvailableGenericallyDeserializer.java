package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.IS_AVAILABLE_GENERICALLY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.IsAvailableGenerically;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IsAvailableGenericallyDeserializer implements JsonDeserializer<IsAvailableGenerically> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IsAvailableGenerically deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IS_AVAILABLE_GENERICALLY(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IS_AVAILABLE_GENERICALLY(), IsAvailableGenerically.class, IS_AVAILABLE_GENERICALLY.class, fldMap);
	}

}
