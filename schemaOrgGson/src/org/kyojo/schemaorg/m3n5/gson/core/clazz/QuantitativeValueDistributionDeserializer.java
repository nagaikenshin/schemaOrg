package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.QUANTITATIVE_VALUE_DISTRIBUTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.QuantitativeValueDistribution;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class QuantitativeValueDistributionDeserializer implements JsonDeserializer<QuantitativeValueDistribution> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public QuantitativeValueDistribution deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new QUANTITATIVE_VALUE_DISTRIBUTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new QUANTITATIVE_VALUE_DISTRIBUTION(), QuantitativeValueDistribution.class, QUANTITATIVE_VALUE_DISTRIBUTION.class, fldMap);
	}

}
