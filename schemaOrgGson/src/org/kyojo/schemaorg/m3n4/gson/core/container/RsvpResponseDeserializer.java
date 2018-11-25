package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.RSVP_RESPONSE;
import org.kyojo.schemaorg.m3n4.core.Container.RsvpResponse;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RsvpResponseDeserializer implements JsonDeserializer<RsvpResponse> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RsvpResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RSVP_RESPONSE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RSVP_RESPONSE(), RsvpResponse.class, RSVP_RESPONSE.class, fldMap);
	}

}
