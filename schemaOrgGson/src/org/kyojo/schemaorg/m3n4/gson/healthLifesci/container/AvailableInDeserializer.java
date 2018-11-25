package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.AVAILABLE_IN;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.AvailableIn;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AvailableInDeserializer implements JsonDeserializer<AvailableIn> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AvailableIn deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AVAILABLE_IN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AVAILABLE_IN(), AvailableIn.class, AVAILABLE_IN.class, fldMap);
	}

}
