package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TIRE_SHOP;
import org.kyojo.schemaorg.m3n5.core.Clazz.TireShop;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TireShopDeserializer implements JsonDeserializer<TireShop> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TireShop deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TIRE_SHOP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TIRE_SHOP(), TireShop.class, TIRE_SHOP.class, fldMap);
	}

}
