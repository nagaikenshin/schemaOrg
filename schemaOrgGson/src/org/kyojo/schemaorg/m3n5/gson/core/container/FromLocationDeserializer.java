package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FROM_LOCATION;
import org.kyojo.schemaorg.m3n5.core.Container.FromLocation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FromLocationDeserializer implements JsonDeserializer<FromLocation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FromLocation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FROM_LOCATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FROM_LOCATION(), FromLocation.class, FROM_LOCATION.class, fldMap);
	}

}
