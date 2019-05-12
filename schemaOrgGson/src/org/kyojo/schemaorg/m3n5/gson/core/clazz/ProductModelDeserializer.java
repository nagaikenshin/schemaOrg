package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PRODUCT_MODEL;
import org.kyojo.schemaorg.m3n5.core.Clazz.ProductModel;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ProductModelDeserializer implements JsonDeserializer<ProductModel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProductModel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRODUCT_MODEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRODUCT_MODEL(), ProductModel.class, PRODUCT_MODEL.class, fldMap);
	}

}
