package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.IS_BASED_ON;
import org.kyojo.schemaorg.m3n5.core.Container.IsBasedOn;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class IsBasedOnDeserializer implements JsonDeserializer<IsBasedOn> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IsBasedOn deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IS_BASED_ON(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IS_BASED_ON(), IsBasedOn.class, IS_BASED_ON.class, fldMap);
	}

}
