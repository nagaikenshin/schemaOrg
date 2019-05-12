package org.kyojo.schemaorg.m3n5.gson.auto.carUsageType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.carUsageType.DRIVING_SCHOOL_VEHICLE_USAGE;
import org.kyojo.schemaorg.m3n5.auto.CarUsageType.DrivingSchoolVehicleUsage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DrivingSchoolVehicleUsageDeserializer implements JsonDeserializer<DrivingSchoolVehicleUsage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DrivingSchoolVehicleUsage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DRIVING_SCHOOL_VEHICLE_USAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DRIVING_SCHOOL_VEHICLE_USAGE(), DrivingSchoolVehicleUsage.class, DRIVING_SCHOOL_VEHICLE_USAGE.class, fldMap);
	}

}
