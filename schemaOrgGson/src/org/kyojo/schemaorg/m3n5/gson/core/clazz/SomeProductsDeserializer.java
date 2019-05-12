package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SOME_PRODUCTS;
import org.kyojo.schemaorg.m3n5.core.Clazz.SomeProducts;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SomeProductsDeserializer implements JsonDeserializer<SomeProducts> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SomeProducts deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SOME_PRODUCTS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SOME_PRODUCTS(), SomeProducts.class, SOME_PRODUCTS.class, fldMap);
	}

}
