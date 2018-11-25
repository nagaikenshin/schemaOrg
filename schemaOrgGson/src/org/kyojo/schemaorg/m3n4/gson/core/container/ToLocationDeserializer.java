package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.TO_LOCATION;
import org.kyojo.schemaorg.m3n4.core.Container.ToLocation;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ToLocationDeserializer implements JsonDeserializer<ToLocation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ToLocation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TO_LOCATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TO_LOCATION(), ToLocation.class, TO_LOCATION.class, fldMap);
	}

}
