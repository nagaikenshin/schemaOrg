package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.YEARLY_REVENUE;
import org.kyojo.schemaorg.m3n4.core.Container.YearlyRevenue;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class YearlyRevenueDeserializer implements JsonDeserializer<YearlyRevenue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public YearlyRevenue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new YEARLY_REVENUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new YEARLY_REVENUE(), YearlyRevenue.class, YEARLY_REVENUE.class, fldMap);
	}

}
