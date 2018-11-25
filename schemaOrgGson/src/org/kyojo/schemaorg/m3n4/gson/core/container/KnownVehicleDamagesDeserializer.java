package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.KNOWN_VEHICLE_DAMAGES;
import org.kyojo.schemaorg.m3n4.core.Container.KnownVehicleDamages;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class KnownVehicleDamagesDeserializer implements JsonDeserializer<KnownVehicleDamages> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public KnownVehicleDamages deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new KNOWN_VEHICLE_DAMAGES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new KNOWN_VEHICLE_DAMAGES(), KnownVehicleDamages.class, KNOWN_VEHICLE_DAMAGES.class, fldMap);
	}

}
