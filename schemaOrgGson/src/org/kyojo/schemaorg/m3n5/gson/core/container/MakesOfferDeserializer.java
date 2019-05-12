package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MAKES_OFFER;
import org.kyojo.schemaorg.m3n5.core.Container.MakesOffer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MakesOfferDeserializer implements JsonDeserializer<MakesOffer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MakesOffer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MAKES_OFFER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MAKES_OFFER(), MakesOffer.class, MAKES_OFFER.class, fldMap);
	}

}
