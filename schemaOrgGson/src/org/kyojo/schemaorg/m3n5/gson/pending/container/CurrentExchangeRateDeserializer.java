package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.CURRENT_EXCHANGE_RATE;
import org.kyojo.schemaorg.m3n5.pending.Container.CurrentExchangeRate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CurrentExchangeRateDeserializer implements JsonDeserializer<CurrentExchangeRate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CurrentExchangeRate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CURRENT_EXCHANGE_RATE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CURRENT_EXCHANGE_RATE(), CurrentExchangeRate.class, CURRENT_EXCHANGE_RATE.class, fldMap);
	}

}
