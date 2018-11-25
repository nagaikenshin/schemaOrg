package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.FUEL_CONSUMPTION;
import org.kyojo.schemaorg.m3n4.core.Container.FuelConsumption;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FuelConsumptionDeserializer implements JsonDeserializer<FuelConsumption> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FuelConsumption deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FUEL_CONSUMPTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FUEL_CONSUMPTION(), FuelConsumption.class, FUEL_CONSUMPTION.class, fldMap);
	}

}
