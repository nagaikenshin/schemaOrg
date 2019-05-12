package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PRICE;
import org.kyojo.schemaorg.m3n5.core.Container.Price;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PriceDeserializer implements JsonDeserializer<Price> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Price deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRICE(), Price.class, PRICE.class, fldMap);
	}

}
