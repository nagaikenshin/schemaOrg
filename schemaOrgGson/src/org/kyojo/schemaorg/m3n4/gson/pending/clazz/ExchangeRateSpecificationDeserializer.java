package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.EXCHANGE_RATE_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ExchangeRateSpecification;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ExchangeRateSpecificationDeserializer implements JsonDeserializer<ExchangeRateSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExchangeRateSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EXCHANGE_RATE_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXCHANGE_RATE_SPECIFICATION(), ExchangeRateSpecification.class, EXCHANGE_RATE_SPECIFICATION.class, fldMap);
	}

}
