package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PRICE_RANGE;
import org.kyojo.schemaorg.m3n5.core.Container.PriceRange;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PriceRangeDeserializer implements JsonDeserializer<PriceRange> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PriceRange deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRICE_RANGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRICE_RANGE(), PriceRange.class, PRICE_RANGE.class, fldMap);
	}

}
