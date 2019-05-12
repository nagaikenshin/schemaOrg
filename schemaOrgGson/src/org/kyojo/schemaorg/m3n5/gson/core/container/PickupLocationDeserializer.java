package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PICKUP_LOCATION;
import org.kyojo.schemaorg.m3n5.core.Container.PickupLocation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PickupLocationDeserializer implements JsonDeserializer<PickupLocation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PickupLocation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PICKUP_LOCATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PICKUP_LOCATION(), PickupLocation.class, PICKUP_LOCATION.class, fldMap);
	}

}