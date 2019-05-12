package org.kyojo.schemaorg.m3n5.gson.core.rsvpResponseType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.rsvpResponseType.RSVP_RESPONSE_NO;
import org.kyojo.schemaorg.m3n5.core.RsvpResponseType.RsvpResponseNo;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RsvpResponseNoDeserializer implements JsonDeserializer<RsvpResponseNo> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RsvpResponseNo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RSVP_RESPONSE_NO(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RSVP_RESPONSE_NO(), RsvpResponseNo.class, RSVP_RESPONSE_NO.class, fldMap);
	}

}
