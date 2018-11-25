package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SERVES_CUISINE;
import org.kyojo.schemaorg.m3n4.core.Container.ServesCuisine;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ServesCuisineDeserializer implements JsonDeserializer<ServesCuisine> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ServesCuisine deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SERVES_CUISINE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SERVES_CUISINE(), ServesCuisine.class, SERVES_CUISINE.class, fldMap);
	}

}
