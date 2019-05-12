package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.AUTO_BODY_SHOP;
import org.kyojo.schemaorg.m3n5.core.Clazz.AutoBodyShop;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AutoBodyShopDeserializer implements JsonDeserializer<AutoBodyShop> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AutoBodyShop deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AUTO_BODY_SHOP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AUTO_BODY_SHOP(), AutoBodyShop.class, AUTO_BODY_SHOP.class, fldMap);
	}

}
