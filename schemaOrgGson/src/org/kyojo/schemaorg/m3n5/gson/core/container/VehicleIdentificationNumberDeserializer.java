package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VEHICLE_IDENTIFICATION_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleIdentificationNumber;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VehicleIdentificationNumberDeserializer implements JsonDeserializer<VehicleIdentificationNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VehicleIdentificationNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VEHICLE_IDENTIFICATION_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VEHICLE_IDENTIFICATION_NUMBER(), VehicleIdentificationNumber.class, VEHICLE_IDENTIFICATION_NUMBER.class, fldMap);
	}

}
