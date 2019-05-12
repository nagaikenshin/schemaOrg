package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ADVANCE_BOOKING_REQUIREMENT;
import org.kyojo.schemaorg.m3n5.core.Container.AdvanceBookingRequirement;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AdvanceBookingRequirementDeserializer implements JsonDeserializer<AdvanceBookingRequirement> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AdvanceBookingRequirement deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ADVANCE_BOOKING_REQUIREMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ADVANCE_BOOKING_REQUIREMENT(), AdvanceBookingRequirement.class, ADVANCE_BOOKING_REQUIREMENT.class, fldMap);
	}

}
