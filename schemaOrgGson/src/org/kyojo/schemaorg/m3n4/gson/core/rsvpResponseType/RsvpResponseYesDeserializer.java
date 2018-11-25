package org.kyojo.schemaorg.m3n4.gson.core.rsvpResponseType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.rsvpResponseType.RSVP_RESPONSE_YES;
import org.kyojo.schemaorg.m3n4.core.RsvpResponseType.RsvpResponseYes;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RsvpResponseYesDeserializer implements JsonDeserializer<RsvpResponseYes> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RsvpResponseYes deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RSVP_RESPONSE_YES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RSVP_RESPONSE_YES(), RsvpResponseYes.class, RSVP_RESPONSE_YES.class, fldMap);
	}

}
