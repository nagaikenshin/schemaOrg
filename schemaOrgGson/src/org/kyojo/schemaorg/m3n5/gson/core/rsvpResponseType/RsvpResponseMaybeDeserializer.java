package org.kyojo.schemaorg.m3n5.gson.core.rsvpResponseType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.rsvpResponseType.RSVP_RESPONSE_MAYBE;
import org.kyojo.schemaorg.m3n5.core.RsvpResponseType.RsvpResponseMaybe;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RsvpResponseMaybeDeserializer implements JsonDeserializer<RsvpResponseMaybe> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RsvpResponseMaybe deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RSVP_RESPONSE_MAYBE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RSVP_RESPONSE_MAYBE(), RsvpResponseMaybe.class, RSVP_RESPONSE_MAYBE.class, fldMap);
	}

}
