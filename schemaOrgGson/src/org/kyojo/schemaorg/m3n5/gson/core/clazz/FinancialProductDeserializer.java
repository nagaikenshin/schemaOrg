package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FINANCIAL_PRODUCT;
import org.kyojo.schemaorg.m3n5.core.Clazz.FinancialProduct;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FinancialProductDeserializer implements JsonDeserializer<FinancialProduct> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FinancialProduct deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FINANCIAL_PRODUCT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FINANCIAL_PRODUCT(), FinancialProduct.class, FINANCIAL_PRODUCT.class, fldMap);
	}

}
