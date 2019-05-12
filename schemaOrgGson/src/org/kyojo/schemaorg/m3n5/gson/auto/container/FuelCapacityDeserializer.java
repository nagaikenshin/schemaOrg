package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.FUEL_CAPACITY;
import org.kyojo.schemaorg.m3n5.auto.Container.FuelCapacity;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FuelCapacityDeserializer implements JsonDeserializer<FuelCapacity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FuelCapacity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FUEL_CAPACITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FUEL_CAPACITY(), FuelCapacity.class, FUEL_CAPACITY.class, fldMap);
	}

}
