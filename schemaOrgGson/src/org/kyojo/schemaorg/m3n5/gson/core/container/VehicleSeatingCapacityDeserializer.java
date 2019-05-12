package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VEHICLE_SEATING_CAPACITY;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleSeatingCapacity;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VehicleSeatingCapacityDeserializer implements JsonDeserializer<VehicleSeatingCapacity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VehicleSeatingCapacity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VEHICLE_SEATING_CAPACITY(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VEHICLE_SEATING_CAPACITY(), VehicleSeatingCapacity.class, VEHICLE_SEATING_CAPACITY.class, fldMap);
	}

}
