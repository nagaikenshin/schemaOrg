package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FOUNDING_LOCATION;
import org.kyojo.schemaorg.m3n5.core.Container.FoundingLocation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FoundingLocationDeserializer implements JsonDeserializer<FoundingLocation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FoundingLocation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FOUNDING_LOCATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FOUNDING_LOCATION(), FoundingLocation.class, FOUNDING_LOCATION.class, fldMap);
	}

}
