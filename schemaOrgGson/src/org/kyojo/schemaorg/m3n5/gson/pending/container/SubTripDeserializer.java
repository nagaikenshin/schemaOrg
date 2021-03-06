package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.SUB_TRIP;
import org.kyojo.schemaorg.m3n5.pending.Container.SubTrip;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SubTripDeserializer implements JsonDeserializer<SubTrip> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SubTrip deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUB_TRIP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUB_TRIP(), SubTrip.class, SUB_TRIP.class, fldMap);
	}

}
