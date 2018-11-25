package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.INTEREST_RATE;
import org.kyojo.schemaorg.m3n4.core.Container.InterestRate;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class InterestRateDeserializer implements JsonDeserializer<InterestRate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InterestRate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INTEREST_RATE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INTEREST_RATE(), InterestRate.class, INTEREST_RATE.class, fldMap);
	}

}
