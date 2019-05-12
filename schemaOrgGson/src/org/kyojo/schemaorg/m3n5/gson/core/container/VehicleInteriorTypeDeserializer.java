package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VEHICLE_INTERIOR_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleInteriorType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VehicleInteriorTypeDeserializer implements JsonDeserializer<VehicleInteriorType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VehicleInteriorType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VEHICLE_INTERIOR_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VEHICLE_INTERIOR_TYPE(), VehicleInteriorType.class, VEHICLE_INTERIOR_TYPE.class, fldMap);
	}

}
