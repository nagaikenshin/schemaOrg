package org.kyojo.schemaorg.m3n4.gson.auto.carUsageType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.auto.carUsageType.RENTAL_VEHICLE_USAGE;
import org.kyojo.schemaorg.m3n4.auto.CarUsageType.RentalVehicleUsage;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RentalVehicleUsageDeserializer implements JsonDeserializer<RentalVehicleUsage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RentalVehicleUsage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RENTAL_VEHICLE_USAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RENTAL_VEHICLE_USAGE(), RentalVehicleUsage.class, RENTAL_VEHICLE_USAGE.class, fldMap);
	}

}
