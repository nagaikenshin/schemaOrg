package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ACCEPTED_OFFER;
import org.kyojo.schemaorg.m3n4.core.Container.AcceptedOffer;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AcceptedOfferDeserializer implements JsonDeserializer<AcceptedOffer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AcceptedOffer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACCEPTED_OFFER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACCEPTED_OFFER(), AcceptedOffer.class, ACCEPTED_OFFER.class, fldMap);
	}

}
