package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ANNUAL_PERCENTAGE_RATE;
import org.kyojo.schemaorg.m3n4.core.Container.AnnualPercentageRate;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AnnualPercentageRateDeserializer implements JsonDeserializer<AnnualPercentageRate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AnnualPercentageRate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ANNUAL_PERCENTAGE_RATE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ANNUAL_PERCENTAGE_RATE(), AnnualPercentageRate.class, ANNUAL_PERCENTAGE_RATE.class, fldMap);
	}

}
