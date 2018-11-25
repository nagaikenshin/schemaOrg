package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.VEHICLE_INTERIOR_COLOR;
import org.kyojo.schemaorg.m3n4.core.Container.VehicleInteriorColor;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class VehicleInteriorColorDeserializer implements JsonDeserializer<VehicleInteriorColor> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VehicleInteriorColor deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VEHICLE_INTERIOR_COLOR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VEHICLE_INTERIOR_COLOR(), VehicleInteriorColor.class, VEHICLE_INTERIOR_COLOR.class, fldMap);
	}

}
