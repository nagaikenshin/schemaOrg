package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DATE_VEHICLE_FIRST_REGISTERED;
import org.kyojo.schemaorg.m3n5.core.Container.DateVehicleFirstRegistered;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DateVehicleFirstRegisteredDeserializer implements JsonDeserializer<DateVehicleFirstRegistered> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DateVehicleFirstRegistered deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new DATE_VEHICLE_FIRST_REGISTERED(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DATE_VEHICLE_FIRST_REGISTERED(), DateVehicleFirstRegistered.class, DATE_VEHICLE_FIRST_REGISTERED.class, fldMap);
	}

}
