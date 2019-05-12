package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PRODUCT;
import org.kyojo.schemaorg.m3n5.core.Clazz.Product;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ProductDeserializer implements JsonDeserializer<Product> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Product deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRODUCT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRODUCT(), Product.class, PRODUCT.class, fldMap);
	}

}