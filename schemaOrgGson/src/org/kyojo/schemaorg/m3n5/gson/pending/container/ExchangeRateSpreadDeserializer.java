package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.EXCHANGE_RATE_SPREAD;
import org.kyojo.schemaorg.m3n5.pending.Container.ExchangeRateSpread;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ExchangeRateSpreadDeserializer implements JsonDeserializer<ExchangeRateSpread> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExchangeRateSpread deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EXCHANGE_RATE_SPREAD(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXCHANGE_RATE_SPREAD(), ExchangeRateSpread.class, EXCHANGE_RATE_SPREAD.class, fldMap);
	}

}
