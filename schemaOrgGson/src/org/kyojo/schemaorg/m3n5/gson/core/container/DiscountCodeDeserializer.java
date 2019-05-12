package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DISCOUNT_CODE;
import org.kyojo.schemaorg.m3n5.core.Container.DiscountCode;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DiscountCodeDeserializer implements JsonDeserializer<DiscountCode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DiscountCode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DISCOUNT_CODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DISCOUNT_CODE(), DiscountCode.class, DISCOUNT_CODE.class, fldMap);
	}

}
