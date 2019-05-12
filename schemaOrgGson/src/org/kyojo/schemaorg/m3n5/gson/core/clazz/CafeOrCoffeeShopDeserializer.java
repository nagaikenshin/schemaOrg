package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CAFE_OR_COFFEE_SHOP;
import org.kyojo.schemaorg.m3n5.core.Clazz.CafeOrCoffeeShop;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CafeOrCoffeeShopDeserializer implements JsonDeserializer<CafeOrCoffeeShop> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CafeOrCoffeeShop deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CAFE_OR_COFFEE_SHOP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CAFE_OR_COFFEE_SHOP(), CafeOrCoffeeShop.class, CAFE_OR_COFFEE_SHOP.class, fldMap);
	}

}
