package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MAX_PRICE;
import org.kyojo.schemaorg.m3n4.core.Container.MaxPrice;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MaxPriceDeserializer implements JsonDeserializer<MaxPrice> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MaxPrice deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MAX_PRICE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MAX_PRICE(), MaxPrice.class, MAX_PRICE.class, fldMap);
	}

}
