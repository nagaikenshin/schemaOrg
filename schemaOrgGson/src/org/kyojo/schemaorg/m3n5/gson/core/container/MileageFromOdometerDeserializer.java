package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MILEAGE_FROM_ODOMETER;
import org.kyojo.schemaorg.m3n5.core.Container.MileageFromOdometer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MileageFromOdometerDeserializer implements JsonDeserializer<MileageFromOdometer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MileageFromOdometer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MILEAGE_FROM_ODOMETER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MILEAGE_FROM_ODOMETER(), MileageFromOdometer.class, MILEAGE_FROM_ODOMETER.class, fldMap);
	}

}
