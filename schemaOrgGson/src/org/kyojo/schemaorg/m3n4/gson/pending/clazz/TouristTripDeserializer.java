package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.TOURIST_TRIP;
import org.kyojo.schemaorg.m3n4.pending.Clazz.TouristTrip;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TouristTripDeserializer implements JsonDeserializer<TouristTrip> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TouristTrip deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TOURIST_TRIP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TOURIST_TRIP(), TouristTrip.class, TOURIST_TRIP.class, fldMap);
	}

}
