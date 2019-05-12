package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.ESTIMATES_RISK_OF;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.EstimatesRiskOf;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EstimatesRiskOfDeserializer implements JsonDeserializer<EstimatesRiskOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EstimatesRiskOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ESTIMATES_RISK_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ESTIMATES_RISK_OF(), EstimatesRiskOf.class, ESTIMATES_RISK_OF.class, fldMap);
	}

}
