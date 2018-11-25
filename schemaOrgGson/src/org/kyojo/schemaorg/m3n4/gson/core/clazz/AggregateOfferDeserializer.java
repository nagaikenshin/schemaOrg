package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.AGGREGATE_OFFER;
import org.kyojo.schemaorg.m3n4.core.Clazz.AggregateOffer;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AggregateOfferDeserializer implements JsonDeserializer<AggregateOffer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AggregateOffer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AGGREGATE_OFFER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AGGREGATE_OFFER(), AggregateOffer.class, AGGREGATE_OFFER.class, fldMap);
	}

}
