package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MONETARY_AMOUNT_DISTRIBUTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.MonetaryAmountDistribution;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MonetaryAmountDistributionDeserializer implements JsonDeserializer<MonetaryAmountDistribution> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MonetaryAmountDistribution deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MONETARY_AMOUNT_DISTRIBUTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MONETARY_AMOUNT_DISTRIBUTION(), MonetaryAmountDistribution.class, MONETARY_AMOUNT_DISTRIBUTION.class, fldMap);
	}

}
