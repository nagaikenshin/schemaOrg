package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.VEHICLE_SPECIAL_USAGE;
import org.kyojo.schemaorg.m3n5.auto.Container.VehicleSpecialUsage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VehicleSpecialUsageDeserializer implements JsonDeserializer<VehicleSpecialUsage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VehicleSpecialUsage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VEHICLE_SPECIAL_USAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VEHICLE_SPECIAL_USAGE(), VehicleSpecialUsage.class, VEHICLE_SPECIAL_USAGE.class, fldMap);
	}

}
