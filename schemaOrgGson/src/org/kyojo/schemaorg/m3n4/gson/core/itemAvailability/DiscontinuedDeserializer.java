package org.kyojo.schemaorg.m3n4.gson.core.itemAvailability;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.itemAvailability.DISCONTINUED;
import org.kyojo.schemaorg.m3n4.core.ItemAvailability.Discontinued;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DiscontinuedDeserializer implements JsonDeserializer<Discontinued> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Discontinued deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DISCONTINUED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DISCONTINUED(), Discontinued.class, DISCONTINUED.class, fldMap);
	}

}
